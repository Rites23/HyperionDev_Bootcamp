# Boolean Variables declared. Each of them are initialised as false. 

have_length = False
up_case = False
low_case = False
have_num = False

# password_check_counter will be set at 0

password_check_count = 0

# valid_answers variable declared. 

valid_answers = True

# We determine if the user entered 6 or less characters. password_check_count +=1 will be True. 

passLenght = input("Does the password have at least 6 characters? (Yes or No) \n")
if passLenght == "Yes":
    have_length = True
    password_check_count +=1

# We determine if the user entered uppercase letters. password_check_count +=1 will be True.

passUpper = input("Does the password contain uppercase letters? (Yes or No) \n")
if passUpper == "Yes":
    up_case = True
    password_check_count +=1

# We determine if the user entered lowercase letters. password_check_count +=1 will be True.

passLower = input("Does the password contain lowercase letters? (Yes or No) \n")
if passLower == "Yes":
    low_case = True
    password_check_count +=1

# # We determine if the user entered numbers. password_check_count +=1 will be True.

passNum = input("Does the password contain numbers? (Yes or No) \n")
if passNum == "Yes":
    have_num = True
    password_check_count +=1

    print("\nThe number of Password Checks is : ", password_check_count)

# Once 3 of the characteristics are met the following will be displayed:

if password_check_count >=3:
     print("Suitable Password \n")

# if the 3 characteristics are not met then the following will be displayed: 

else : 
     print("Not a Suitable Password \n")