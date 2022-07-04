import nltk
import sys
import time

def openFile(inpath):
    res = []
    with open(inpath, 'r', encoding='utf-8') as fo:
        for line in fo:
            res.append(line.strip())
    return res


def POSTagging(corpus_to_list):

    nltk.download('averaged_perceptron_tagger')

    final = []
    for tokentags in nltk.pos_tag(corpus_to_list):
        token = tokentags[0]
        tag = tokentags[1]
        if tag.startswith("JJ"):
            tag = "ADJ"
        elif tag.startswith("RB"):
            tag = "ADV"
        elif tag.startswith("VB"):
            tag = "V"
        final.append(token + "\t" + tag + "\n")
        
    return final

def save(tosave, outpath):
    with open(outpath, 'w', encoding='utf-8') as fw:
        for v in tosave: 
            fw.write(v)


if __name__ == "__main__":
    inpath = "./dictionary_result/collected.out"
    outpath = "./dictionary_result/en_pos.out"
    corpus_to_list = openFile(inpath)
    to_save = POSTagging(corpus_to_list)
    save(to_save, outpath)
