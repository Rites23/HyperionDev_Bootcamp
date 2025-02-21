# The below calculates and displays the lenght of the string value. The users input is stored in str_manip. 
str_manip = input("Please enter a sentence: ")
print (len(str_manip))
 
# The last letter of the word in the sentence needs to be replaced with '@'. Therefore we used the replace()
# funtion for the last letter of the words in the sentence. That would be [-1] 
sentence = input("Please enter a sentence: ")
new_char = '@'
str_manip = sentence.replace(sentence[-1], new_char)
print (str_manip)

# The below prints the last 3 characters of the str_manip backwards. Taking the "This is a bunch of 
# words" example, the last word of the sentence is words. So splicing would be used, str_manip[-1] would 
# output s, str_manip[-2] would output d and str_manip[-3] would output r
str_manip = input ("Please enter a sentence: ") 
answer =len(str_manip) 
print (str_manip[-1] + str_manip[-2] + str_manip [-3])

# The below prints a five-letter word that is made up of the first three characters
# and the last two characters in str_manip. Taking the "This is a bunch of words" example, the splicing 
# used for the first three characters is str_manip [0:3] and the last two characters seperately would be
# str_manip[-2] and str_manip[-1]
str_manip = input ("Please enter a sentence: ") 
answer =len(str_manip) 
print (str_manip[0:3] + str_manip[-2] + str_manip [-1])

# The below prints each word on a new line. We using the replace() to move each word to a new
# line using the \n escape character. 
str_manip = input ("Please enter a sentence: ") 
print(str_manip.replace(" ", "\n"))
 