import math
# Enter your code here. Read input from STDIN. Print output to STDOUT
z= complex(input().strip())
r= abs(z)
theta= math.atan2(z.imag, z.real)
print(f"{r:.3f}")
print(f"{theta:.3f}")


# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna