# Requested user to enter 3 products. These products entered are stored in "product1", "product2" and 
# "product3" respectively. We then use the float() method to get the prices. 

user = input ("Enter the name of three products?")
product1 = float(input("What is the price?"))
product2 = float(input("What is the price?"))
product3 = float(input("What is the price?"))

# I have used the sum() function to get the total of all three products. 

sum = product1 + product2 + product3
print ("The total of all three products:", sum)

# The average price was calculated by using the sum divided by the number of products. 
# I have also used the round() function. 

average = (sum / 3)
print ("The average price of the three products:", round(average))

# The following needed to be printed out to get the sum and average in one sentence. 

print ("The total of [product1], [product2], [product3] is", sum, "and the average price of the items is", (round(average)))
