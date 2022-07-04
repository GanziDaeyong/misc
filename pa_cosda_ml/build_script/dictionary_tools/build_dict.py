from tqdm import tqdm
import sys
from googletrans import Translator
import time


def toList(en_words):
    list_to_count = []
    with open(en_words, 'r', encoding = 'utf-8') as fo:
        for line in fo:
            list_to_count.append(line.strip())
    return list_to_count


def transEng(list_to_count):

    translator = Translator()
    to_save = []
    for line in tqdm(list_to_count):
        try:
            translated = translator.translate(line, dest=dest_lang).text
        except:
            print("[ERROR] "+line)
            continue
        line += "\t"+ translated
        to_save.append(line)
        time.sleep(2)
    return to_save

def save(to_save, outpath):
    with open(outpath, 'w', encoding='utf-8') as fw:
        for v in to_save: 
            fw.write(v.strip() + "\n")

if __name__ == "__main__":

    #base_path = sys.argv[1]
    dest_lang = sys.argv[1]

    en_words = "./dictionary_result/collected.out"
    #en_words = "./collected_test.out"
    outpath = "./dictionary_result/en_"+str(dest_lang)+"_dict.out"
    #outpath = "./result/en_"+str(dest_lang)+"_dict2.out"
    list_to_count = toList(en_words)
    to_save = transEng(list_to_count)
    save(to_save, outpath)
