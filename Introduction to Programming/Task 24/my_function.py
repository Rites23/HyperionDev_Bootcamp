def days_of_week():
    print ('Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday',
            'Sunday')

# We call the function to print the days of the week
days_of_week()

# We define a function replace()
# We ask the user to enter a sentence
# We replace every second word in the sentence with the word "hello" 

def replace():
    hello = []

string = input("\nPlease enter a sentence : ")
hello = " ".join(["{} hello".format(word) 
        for idx, word in enumerate(string.split()) 
        if idx % 2 == 0])

print(hello)
replace()


    
    

    
