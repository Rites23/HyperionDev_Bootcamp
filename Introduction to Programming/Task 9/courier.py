# Get user to enter the price of the package. We used float.

package = float(input("Enter the price of the package you would like to purchase: \n"))

# Get user to enter the distance of the delivery. Float is also used

distance = float(input("Enter the total distance of the delivery in kms: \n"))

print ("Please choose your shipping preference: \n")

# We get the user to enter either Air or Freight. That will also determine the price to be used. 

print ("Air R0.36 per km or freight R0.25 per km? \n")
transport_choice = str.capitalize(input("Enter: 'Air' or 'Freight'\n"))

cost_per_distance = 0
if transport_choice == ['Freight']:
    cost_per_distance = 0.25
elif transport_choice == ['Air']:
    cost_per_distance = 0.36

# We get the user to enter either Full or Limited for insurance. That will also determine the price to be used.

print ("Full insurance R50.00 or Limited Insurance R25.00 \n")
insurance_choice = str.capitalize(input("Enter: 'Full' or 'Limited' \n"))

insurance_cost = 0
if insurance_choice == ['Full']:
    insurance_cost = 50.00
elif insurance_choice == ['limited']:
    insurance_cost = 25.00

# We get the user to enter either Gift or No Gift if they require one.

print ("Gift R15.00 or no gift R0.00 \n") 
gift_choice = str.capitalize(input("Enter: 'Gift' or 'No Gift' \n"))

gift_cost = 0 
if gift_choice == ['Gift']:
    gift_cost = 15.00
elif gift_choice == ['No Gift']:
    gift_cost = 0.00

# We get the user to enter either Priority or Standard for delivery. That will also determine the price to be used.

print ("Priority R100.00 or standard delivery R20.00 \n")
delivery_choice = str.capitalize(input ("Enter: 'Priority' or 'Standard' \n"))

delivery_cost = 0
if delivery_choice == ['Priority']:
    delivery_cost = 100.00
elif delivery_choice == ['Standard']:
    delivery_cost = 20.00

# The total cost will be produce as per below calculations: 

total_cost = package + distance * cost_per_distance + insurance_cost + gift_cost + delivery_cost 
print (total_cost)