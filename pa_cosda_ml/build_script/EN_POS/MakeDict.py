import nltk
import sys

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

def save(tosave):
    with open("en_pos.out", 'w', encoding='utf-8') as fw:
        for v in tosave: 
            fw.write(v)


if __name__ == "__main__":

    inpath = sys.argv[1]
    corpus_to_list = openFile(inpath)
    to_save = POSTagging(corpus_to_list)
    save(to_save)
