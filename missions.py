#!/usr/bin/env python3
plink = 'https://www.udemy.com/course/python-1000/?referralCode=D3A7B607149F46D12A28'
doc = f''' 
> This file was created by [this](./missions.py) Python script.
Learn what Python scripts [can do]({plink}) for you!
'''
import os
ofile = './MISSIONS.md'
mfile = 'MISSION.md'

def get_mission(afile, fout):
    prefix = '## '
    with open(afile) as fh:
        mission = prefix
        mission += fh.read().split(prefix)[1].strip()
        print(mission, end="\n\n", file=fout)
        

with open(ofile, 'w') as fh:
    print(doc, "\n", file=fh)
    for root, dirs, files in os.walk("./com"):
        aroot = root.replace('\\', '/')
        for file in files:
            if file == mfile:
                afile = aroot + "/" + file
                get_mission(afile, fh)
                print(f"> Go to [Mission]({afile})", file=fh)
                print(file=fh)
