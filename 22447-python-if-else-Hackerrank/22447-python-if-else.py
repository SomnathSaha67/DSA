#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    if (n%2==0):
        if(2<=n<=5):
            print("Not Weird")
        elif(6<=n<=20):
            print("Weird")
        else:
            print("Not Weird")
    else:
        print("Weird")        


# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna