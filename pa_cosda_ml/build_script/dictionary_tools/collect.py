import re
import sys

base_path = sys.argv[1]
inpath1 = base_path+"/neg.txt"
inpath2 = base_path+"/pos.txt"
#inpath3 = "pos.txt"
#inpath4 = "strneg.txt"
#inpath5 = "strpos.txt"
#inpathlist = [inpath1, inpath2, inpath3, inpath4, inpath5]
inpathlist = [inpath1, inpath2]
outpath = "./result/collected.out"

t = set()

for v in inpathlist:
    with open(v, 'r', encoding = 'latin-1') as fo:
        for line in fo:
            line = line.strip()
            line = re.sub('[-=+,#/\?:^$.@*\"※~&%ㆍ!』\|\(\)\[\]\<\>`\'…》]','', line)
            tokens = line.split(" ")
            for tok in tokens:
                if tok.strip()=="":
                    continue
                t.add(tok.lower())

new_t = list(t)

with open("./dictionary_result/collected.out", 'w', encoding="utf-8") as fw:
    for v in new_t:
        fw.write(v.strip()+"\n")

			
				
