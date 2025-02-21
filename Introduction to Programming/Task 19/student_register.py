# We ask the user to enter how many students are registering. 

students = int(input("Please enter how many students are registering? "))
id_number = ""

# We use a for loop to check the student ID numbers against the amount of students registering. 
for a in range (0, students):
    id_number = (int(input("Please enter student ID numbers ")))
    id_number = id_number + 1

    # We open the reg_form.txt and it will be used as an attendance register that they will sign when they
    # arrive at the exam venue
    with open('reg_form.txt', 'w') as file:
        file.write("Student ID numbers: \n" + str(id_number))

print ("Thank you, ID numbers saved to txt file reg_form!")