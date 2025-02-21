import random

# List of jokes created
jokes = ["I used to have a handle on life, but then it broke",
         "I was wondering why the frisbee kept getting bigger and bigger, but then it hit me",
         "I started out with nothing, and I still have most of it",
         "Smoking will kill you… bacon will kill you… and yet, smoking bacon will cure it",
         "My math teacher called me average. She’s so mean!",
         "Keep the dream alive — hit your snooze button",
         "A baseball walks into a bar, and the bartender throws it out",
         "I had an “hourglass” figure, but then the sand shifted",
         "What vitamin helps you to see? Vitamin C",
         "I know they say that money talks, but all mine says is ‘Goodbye’",]

# Put the list in a random order
joke = random.choice(jokes) 

# Prints random jokes
print(joke)