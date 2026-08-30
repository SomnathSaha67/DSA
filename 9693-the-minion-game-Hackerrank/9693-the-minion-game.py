def minion_game(string):
    # your code goes here
    k_score=s_score=0
    vowels="AEIOU"
    length= len(string)
    for i in  range(length):
        if string[i] in vowels:
            k_score+=length-i
        else:
            s_score+=length-i
    if k_score>s_score:
        print("Kevin", k_score)
    elif s_score>k_score:
        print("Stuart",s_score)
    else:
        print("Draw")


# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna