def printIncreasingPower(x):
    #code here
    # Loop to jump in powers of 2
    i=1
    while(i<x):
        #code here
        if i*i>x:
            break
        else:
            print (i*i, end = " ")
            i+=1
        #code here