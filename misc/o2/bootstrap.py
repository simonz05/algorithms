#!/usr/bin/env python
import os
import sys
import subprocess
import shutil

#pwd = os.path.dirname(__file__)
pwd = os.getcwd()
vedir = os.path.join(pwd,"ve")

if os.path.exists(vedir):
    shutil.rmtree(vedir)

subprocess.call(["pip","install",
                 "-E",os.path.join(pwd,"ve"),
                 #"--enable-site-packages",
                 "--requirement",os.path.join(pwd,"requirements.txt")])
