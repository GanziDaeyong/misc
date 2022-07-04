#!/bin/bash

echo -e "\n영-외국어 사전 만들기\n\n입력 형식과 방법은 동봉된 readme.txt에서 확인할 수 있습니다.\n"
read -p "First Langauge to build dict: " language1
read -p "First Langauge to build dict: " language2

mkdir -p "./dictionary_tools/dictionary_result"
mkdir -p "./dataset/src_tgt/$language1/test"
mkdir -p "./dataset/src_tgt/$language2/test"


echo -e "\n[필요한 파이썬 라이브러리를 설치합니다.]\n"
pip install -r "./dictionary_tools/requirements"

python3 ./dictionary_tools/collect.py ./dictionary_tools/en_train
python3 ./dictionary_tools/build_pos.py
python3 ./dictionary_tools/build_dict.py $language1 $language2
