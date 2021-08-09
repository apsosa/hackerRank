#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'jumpingOnClouds' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY c as parameter.
#

def jumpingOnClouds(c):
    # Write your code here
    jumps = 0
    i = 1
    ceros = 0
    while i < len(c):
        if c[i] == 1:
            if ceros % 2 == 0:
                #00 10
                jumps += ceros // 2 + 1
            else:
                #01 0
                jumps += ceros // 2 + 2    
            i += 1
            ceros = 0
        else:
            ceros += 1
        i += 1
    if ceros > 0:
        jumps += 1 
    return jumps

c1 = [0,0,1,0,0,0,0,1,0,0]
c2 = [0,0,1,0,0,1,0]
c3 = [0,0,0,1,0,0]
print(jumpingOnClouds(c1)== 6)
print(jumpingOnClouds(c2)== 4)
print(jumpingOnClouds(c3)== 3)

