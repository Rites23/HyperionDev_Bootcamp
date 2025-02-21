# We use the below command to open the user.txt and 'rt' to read file as text. 
users = {}
with open ('user.txt', 'rt')as username:
    for line in username:
        username, password = line.split(", ")
        users[username.strip()] = password.strip()  # strip removes leading/trailing whitespaces.

# We ask the user to enter their username. If incorrect it will print "Please enter a valid username: "
user_username = input("Please enter your username: ")
while user_username not in users:
    print("The username is incorrect.")
    user_username = input("Please enter a valid username: ")

if user_username in users:
            print ("The username is correct.")

with open('user.txt', 'rt') as password:
     for line in password:
        username, password = line.split(", ")

# strip removes leading/trailing whitespaces.
        users[password.strip()] = username.strip()

# We ask the user to enter their password. If incorrect it will print "Please enter a valid password: "  
user_password = input("Please enter your password: ")
while user_password not in users:
     print("Your username is correct but your password is incorrect.")
     user_password = input("Please enter a valid password: ")

if user_password in users:
     password2 = ("Your password is correct.")
     print (password2)

if password2 == ("Your password is correct."):

# Give the user options to proceed.
    user_options = input("""
Please select one of the following options: 
r - register a user
a - add a task
va - view all tasks
vm - view my tasks
e - exit
""")

if user_options == "r":
    new_user = (input("Please enter a new user name: "))
    new_user_password = (input("Please enter a new password: "))

    new_password = False

# Add a 'while loop' untill the condition is met(True).
    while new_password == False:   
        confirm_new_password = input("Please retype your password to confirm: ")

        if new_user_password == confirm_new_password:
                new_password = True

        elif new_password == False:
            print("Your passwords do not match!")

    with open ('user.txt', 'a')as user_file:
        user_file.write(f"\n{new_user}, {new_user_password}")


# Add a task to a specific user.
elif user_options == "a":

    task_file = open("tasks.txt", "a+")

    new_task_username = input("Please enter the 'username' of the person this task will be assigned to: ")
    new_task_tile = input("Please enter the 'tile' of the new task: ")
    new_task_description = input("Please give a brief description of the new task:\n")
    new_task_due_date = input("""Please enter the due date of the given task, in the following 
format;
dd-mm-yyyy:\n""")
    new_task_completed = input("Is the new task completed (Yes / No): ")

    task_file.write(f"\n{new_task_username}, {new_task_tile}, {new_task_description}, {new_task_due_date}, {new_task_completed}")

    task_file.close()

 # View all tasks.
 # Note: You have to add tasks first before you can view all tasks.
elif user_options == "va":
    task_file = open("tasks.txt", "r")

    for line in task_file:
        new_task_username, new_task_tile, new_task_description, new_task_due_date, new_task_completed = line.split(", ")

        print(f"""
New task username:      {new_task_username}
Task tile:              {new_task_tile}
Task description:       {new_task_description}
Task due date:          {new_task_due_date}
Task completion:        {new_task_completed}
""")

task_file.close()

# View task assigned to a user.
if user_options == "vm":
        with open("tasks.txt", "r") as task_file:

         for line in task_file:
            new_task_username, new_task_tile, new_task_description, new_task_due_date, new_task_completed = line.split(", ")

            if user_username == new_task_username:
                 print(f"""
New task username:      {new_task_username}
Task tile:              {new_task_tile}
Task description:       {new_task_description}
Task due date:          {new_task_due_date}
Task completion:        {new_task_completed}
""")


elif user_options == "e":
    exit

else:
    print("Invalid selection! Please choose a valid option.")

# Only the user logged in as 'admin', will be able to access this menu.
if user_options == "r":   

    if user_username != "admin":
        
        print ("You are not an admin user, only admin can register new users.")

    elif user_username == "admin":

# Create a new menu to display for admin.
        admin_menu = (input("""
Please select one of the following options:
r - register a new user
d - display statistics = Total number of tasks & users
e - exit
"""))

        if admin_menu == "r":

            new_user = (input("Please enter a new user name: "))
            new_user_password = (input("Please enter a new password: "))

            new_password = False

# Add a 'while loop' untill the condition is met(True).
            while new_password == False:   
                confirm_new_password = input("Please retype your password to confirm: ")

                if new_user_password == confirm_new_password:
                    new_password = True

                elif new_password == False:
                    print("Your passwords do not match!")

            with open ('user.txt', 'a')as user_file:
                user_file.write(f"\n{new_user}, {new_user_password}")

        elif admin_menu == "d":

# These varibles will only count the lines inside the 'txt' files,
# but since we are storing every new task & user on a new line,
# we can just count the lines for the desired results.
            tasks_num = 0
            users_num = 0

            with open("tasks.txt", "r") as task_file:
                for line in task_file:
                    tasks_num += 1
            print (f"\nTotal number of tasks: {tasks_num}")

            with open("user.txt", "r") as username:
                for line in username:
                    users_num += 1
            print (f"Total number of users: {users_num}")

        elif admin_menu == "e":
            exit