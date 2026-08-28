def nextPrime(n):
    
    # code here to find next prime number
    # return next prime number
    for i in range(n+1, n+100):
        c=0
        for j in range(2, i//2):
            if (i%j==0):
                c+=1
        if(c==0):
            return i

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna