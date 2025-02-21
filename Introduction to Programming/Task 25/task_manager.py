# Importing packages
import datetime
from asyncio import tasks, all_tasks
from datetime import date
import os, sys, string
t1 = open("tasks.txt", "r+")
ofile = t1.read()
t2 = open("user.txt" , "r+")
ofile_1 = t2.read()

# Declaring test variable
complete = False
# Parameters for logon credentials
user = {"admin": "adm1n", "Tom": "12345"}

# while condition to login and verify password and username
while not complete:
    username = input("Please enter your username: ")
    password = input("Please enter your password: ")
    if username == user and password == password:
        continue
    elif username not in user:
        print("This is not a valid username, input username again!")
        continue
    elif password != user[username]:
        print(f"Password is not valid for {username}. ")
        continue
    elif password == user[username]:
        print(f"Welcome {username} ")
        print(f"Thank you for logging on. ")
        complete = True

print("Username and Password are valid you can proceed to the menu")

# Displays menu option should the user have logged on correctly

menu1 = """
Please select one of following options (r-ds):
r) Register User
a) Add Task
va) View All Tasks
vm) View My Tasks
gr) Generate Report
ds) Display Statistic
e) Exit
"""

t2 = open("user.txt", "r+")
ofile_1 = t2.read()
valid = False
admin = False
users = open("user.txt","r+")

option = str(input(menu1))

if option == "r":
    # Only admin can add a new user
    while username == "admin":
     
        def reg_user():
            check = False
            check_user = False
            
            while check_user == False:

                new_user = input("please enter a desired new user name: ")
                users = open("user.txt","r+")
                list_user = []
                for line in users:
                    # Splits each section in the line by a comma
                    split_user = line.split(",") 
                    list_user.append(split_user[0])
                if f"{new_user}" in list_user:
                    print("Username already exist")  
                else:
                    check_user = True
                # Makes a loop to make sure password is correct    
            while check == False: 
                new_password = input("Please enter a password for the new user: ")
                password_check = input("Please re-enter the password: ")
                # Checks if passwords match
                if new_password == password_check: 
                    check = True 
                    # Prints at the bottom of the list
                    users.seek(0,2)
                    # Write the the username and password into a txt file
                    users.write(f"\n{new_user}, {password_check}") 
                    print ("New username and password have been registered") 

                                
        reg_user()

if option == "a":
    # User inputs for parameters of new tasks
    def add_new_task():
        username_1 = input("Please enter the user you would like to assign the task to: ")
        task_name = input("Please enter the title of the task: ")
        task_desc = input("Please give a short description of what the task does: ")
        due_date = input("Please give the due date for the task: ")
        completed = "No"
        # All info on new task will be written to the tasks file
        t1.write("\n" + username_1 + ", " + task_name + ", " + task_desc + ", " + str(
            date.today()) + ", " + due_date + ", " + completed)
        t1.close()
        print ("The new task has been added to the task text file")
    add_new_task()

if option == "va":
    def view_all_task():
        
        # Program will print all current ongoing tasks to the terminal
        t3 = open("tasks.txt", "r+")
        contents = t3.read()
        t3.close()
        print(contents)
    view_all_task()
            

if option == "vm": 
    def view_mine():
        # Adds the lines to a list, line by line
        tasks_view = open("tasks.txt","r").readlines()
        counter = -1
        # Used for a list of lines to rewrite the folder
        tasks = [] 
        # Used to track the usernames task numbers
        task_numbers = [] 
        for line in tasks_view:
            tasks.append(line)
            # Splits each section in the line by a comma
            split_task = line.split(",") 
            counter += 1
            # Checks for the username in the line to print those tasks only
            if username == (split_task[0]): 
                print (f"Task number: {counter}")
                print(f"Task: {split_task[1]}\nassingned to: {split_task[0]}\nTask decription: {split_task[2]}") # split print for easier reading
                print(f"Date assigned: {split_task[3]}\nDue date: {split_task[4]}\nTask Complete? {split_task[5]}\n")
                task_numbers.append(counter)

        valid = False
        while valid == False:
            task_number = int(input("Please enter the task number you would like to select to edit: "))
            if task_number in task_numbers and split_task[5] == " No":
                valid = True
                # Checks if the task is complete and wont allow it through if it is
            elif split_task[5] == " Yes": 
                print("you cannot edit a completed task please try again.")
            elif task_number not in task_numbers:
                print("You have entered a task number not corresponding to your username.")
        # Reads the line from file
        line = tasks_view[task_number] 
        # Splits each line into a list and print the items in the list in their specific spot
        split_task = line.split(",") 
        print((f"Task number: {task_number}"))
        # Split print for easier reading
        print(f"Task: {split_task[1]}\nassingned to: {split_task[0]}\nTask decription: {split_task[2]}")  
        print(f"Date assigned: {split_task[3]}\nDue date: {split_task[4]}\nTask Complete? {split_task[5]}\n")
        
        choice = input("would you like to edit the task above to complete enter 'complete' or 'edit' to edit the task or '-1' to exit: ").lower()
        # Exits to main menu
        if choice == "-1":
            return   

        if choice == "complete":
            # Clears file to make a new edited version
            tasks_view = open("tasks.txt","w") 
            # Deletes the part in editing from the list 
            del tasks[task_number]
            for lines in tasks:
                # This will start at first line and end at the last line where it stops, used to add something at the end
                tasks_view.seek(0,2) 
                # Writes the new info to the bottom of the task list 
                tasks_view.write(lines)  
                # This will start at first line and end at the last line where it stops, used to add soemthing at the end
            tasks_view.seek(0,2) 
            tasks_view.write(f"{split_task[0]},{split_task[1]},{split_task[2]},{split_task[3]},{split_task[4]}, Yes")
            # Writes the new info to the bottom of the task file
            tasks_view.close()   
            
        if choice == "edit": 
            user_list = []
            tasks_view = open("tasks.txt","w")
            del tasks[task_number]
            for lines in tasks:
                # This will start at first line and end at the last line where it stops, used to add something at the end
                tasks_view.seek(0,2) 
                # Writes the new info to the bottom of the task list 
                tasks_view.write(lines) 
            user_valid = False
            # This loops will not allow a username to be assigned to a task that doesnt exist
            while user_valid == False: 
                new_username = input("please enter the username of the new person assigned the to the task: ")
                users = open("user.txt","r")
                for line in users: 
                    # Generates the new folder for users
                    line_strip = line.strip("\n")
                    # Splits the new line command that is there in the other file to allow for easier handling
                    split_line = line_strip.split(",") 
                    # Splits the username from password
                    user_list.append(split_line[0]) 
                    # Makes list of user names
                if new_username in user_list: 
                    # Checks the new username to see if it exist
                    due_date = input("please enter the new due date of the task E.g 10 Oct 2019: ")
                    tasks_view.write(f"{new_username},{split_task[1]},{split_task[2]},{split_task[3]},{due_date}, No")
                    tasks_view.close()
                    user_valid = True
                else:
                    print("assignment cannot be assigned to that user as it does not exist, please try again.")
                
        print("tasks have be succsefully updated.")
    view_mine()

if option == "gr":
    # Only admin can generate reports
    while username == "admin":
        def generate():
            # Function that gets todays date and assign it to the program
            today = str(date.today()) 
            # Generating new folders
            task_overview = open("task_overview.txt","w") 
            user_overview = open("user_overview.txt","w")
            tasks = open("tasks.txt","r")
            users = open("user.txt","r")
            # Accounts for all the data
            yes = 0 
            no = 0
            overdue = 0
            task_counter = 0
            task_list = []
            # Generates the new folder for tasks
            for line in tasks: 
                # Splits each line into a list and print the items in the list in thier specific spot
                split_task = line.split(",") 
                task_counter += 1
                # Make a task list for the user part later on
                task_list.append(split_task) 
                if split_task[5] == " Yes":
                    yes += 1
                elif split_task[5] == " No" or " No\n":
                    no += 1
                    # Strips space before date
                    date = split_task[4].strip(" ") 
                    if today > date:
                        overdue +=1
            total = no + yes
            percentage = no / total
            percentage_overdue = overdue / no
            task_overview.seek(0,2)
            task_overview.write(f"There are total of {yes} completed tasks\n")
            task_overview.write(f"There are total of {no} uncompleted tasks\n")
            task_overview.write(f"There are a total of {overdue} overdue tasks\n")
            # Conversion to a percentage
            task_overview.write(f"{(percentage*100):.2f}% of tasks are incomplete\n") 
            task_overview.write(f"{(percentage_overdue*100):.2f}% of uncompleted tasks are overdue.")

            user_counter = 0
            user_list = []
            another_lst = []
            complete_counter = 0
            overdue = 0
            # Generates the new list for users
            for line in users: 
                # Splits the new line command that is there in the other file to allow for easier handling
                line_strip = line.strip("\n")
                # Splits the username from the password
                split_line = line_strip.split(",")
                user_list.append(split_line[0]) 
            for usernames in user_list:
                for index in range (0 ,len(task_list)):
                    # Searches and counts how many times a function appears as well as if its compelete
                    if f'{usernames}' in f"{task_list[index]}" and " Yes" in f"{task_list[index]}": 
                        user_counter +=1
                        complete_counter += 1
                        # Counts the remaining uncompleted tasks
                    elif f'{usernames}' in f"{task_list[index]}":
                        user_counter +=1
                        date = task_list[index][4].strip(" ")
                        if today > date:
                            overdue +=1
                # Appends them to the list seperatly but in order so username then number of tasks ect
                another_lst.append(f"{usernames}") 
                another_lst.append(user_counter)
                another_lst.append(complete_counter)
                another_lst.append(overdue)
                # Used to reset counter for the next user each loop
                complete_counter = 0 
                user_counter = 0
                overdue = 0
            try:
                it = iter(range(0, len(another_lst)))
                i = 0
                counter = 1
                # This loop makes jump in i to skip every turn by 3 number for the new user
                while i in it: 
                    if i >= counter:
                        for j in range(0, 3):
                            # This skips i values by 3 by nexting the next one
                            i = next(it) 
                            # The next function breaks the code even though the output is correct, so put in try to continue 
                    user_overview.write(f"username {another_lst[i]}.\n")
                    user_overview.write(f"has {another_lst[i+1]} tasks.\n")     
                    math = another_lst[i+1] / total 
                    user_overview.write(f"which is {(math*100):.2f}% of the total tasks.\n")
                    # Works out the complete percentage
                    complete = another_lst[i+2] / another_lst[i+1] 
                    user_overview.write(f"With {(complete*100):.2f}% of the tasks being completed.\n")
                    user_overview.write(f"With {((1-complete)*100):.2f}% of the tasks being uncompleted.\n")
                    incomplete = another_lst[i+1] - another_lst[i+2]
                    if incomplete == 0:
                        overdue_percentage = 0.00
                    else:
                        overdue_percentage = another_lst[i+3] / incomplete
                    user_overview.write(f"Of the {incomplete} incomplete task {(overdue_percentage*100):.2f}% are overdue.\n\n")
                    i += 1
            except: 
                print("user and task reports have been succesfully generated")
            finally:
                task_overview.close()
                user_overview.close()
                users.close()
        generate()

if option == "ds":
    # Only admin can display the statistics
    while username == "admin":
    # Function to display the statistics
        def display_stats():
            # Wipes the old folder to generate a new one
            task_overview = open("task_overview.txt","r") 
            user_overview = open("user_overview.txt","r")
            # Reads the lines in the folder
            for line in task_overview: 
                line_strip = line.strip("\n")
                print(line_strip)
            print("")
            # Reads the lines in the folder
            for line in user_overview: 
                line_strip = line.strip("\n")
                print(line_strip)
            task_overview.close()
            user_overview.close()
        display_stats()  