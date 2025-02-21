# List called menu, which contains 4 items in the cafe
menu = ['Cheeseburger', 'Pizza', 'Chips', 'Juice']

# Dictionary called stock, which should contain the stock value for each item on the menu.
stock = {'Cheeseburger' : 27, 'Pizza' : 20, 'Chips' : 18, 'Juice' : 10}

# Dictionary called price, which should contain the prices for each item on your menu
price = {'Cheeseburger' : 40, 'Pizza' : 70, 'Chips' : 35, 'Juice' : 20}

# The total stock worth in the cafe using the for loop
total = 0
for i in menu:
    total += stock[i] * price[i]
    print(total)