# We ask the enter a word / sentence. 

string = input("Enter your string: ")

# We store each letter followed by the number of occurrences in a dictionary and print it out.
f = {}

# We make use of a for loop.
for i in string:
  f[i] = f.get(i,0) + 1
print(f)