# Task 15
# Creating a fun game using Pygame.

# Importing the game library with required functions for the program.
# Importing random numbers function.
import pygame 
import random  


# Getting everything started by initiating the pygame modules.
pygame.init() 

# Setting the height and width of the screen.
screen_width = 1100
screen_height = 700

# Creating the screen with a 2 item sequence as specified by width and height dimensions.
screen = pygame.display.set_mode((screen_width,screen_height)) 

# Creating the player, enemies and prize characters.
# I created my own character images using paint.
# Assigning images to them from this folder.
player = pygame.image.load("image.png")
enemy_1 = pygame.image.load("monster.jpg")
enemy_2 = pygame.image.load("enemy.png")
enemy_3 = pygame.image.load("player.jpg")
prize = pygame.image.load("prize.jpg")

# Getting the height and width of the character images.
# This enables boundary detection.
player_height = player.get_height()
player_width = player.get_width()
enemy_1_height = enemy_1.get_height()
enemy_1_width = enemy_1.get_width()
enemy_2_height = enemy_2.get_height()
enemy_2_width = enemy_2.get_width()
enemy_3_height = enemy_3.get_height()
enemy_3_width = enemy_3.get_width()
prize_height = prize.get_height()
prize_width = prize.get_width()

# Setting x and y values for the player position.
player_X = 100
player_Y = 50

# Setting the x and y positions for the enemy characters.
enemy_1X = 900
enemy_1Y = 20
enemy_2X = 50
enemy_2Y = 700
enemy_3X = 400
enemy_3Y = 25

# Setting the x and y characters for the prize object.
prize_X = 900
prize_Y = 700
 
# Setting Boolean values for the up, down, left and right keys.
keyUp= False
keyDown = False
keyLeft = False
keyRight = False

# Creating the game loop. 
while 1: 
    
    screen.fill(0) # Clearing the screen.

    # Drawing character images to the screen at specified x and y positions.
    screen.blit(player, (player_X, player_Y))
    screen.blit(enemy_1, (enemy_1X, enemy_1Y))
    screen.blit(enemy_2, (enemy_2X, enemy_2Y))
    screen.blit(enemy_3, (enemy_3X, enemy_3Y))
    screen.blit(prize, (prize_X, prize_Y))

    # Updating the screen.
    pygame.display.flip()
    
    # Creating a loop for events in the game.
    for event in pygame.event.get():

        # Checking if the user exits the game and closing the program safely.
        if event.type == pygame.QUIT:
            pygame.quit()
            exit(0)
            
        # Checking if the user presses a key down.
        if event.type == pygame.KEYDOWN:
        
            # Testing if the key pressed is the up, down, left or right key.
            # Setting previously assigned Boolean values to true.
            if event.key == pygame.K_UP:
                keyUp = True
            if event.key == pygame.K_DOWN:
                keyDown = True
            if event.key == pygame.K_LEFT:
                keyLeft = True
            if event.key == pygame.K_RIGHT:
                keyRight = True
        
        # Checking if the user releases a key.
        if event.type == pygame.KEYUP:
        
            # Testing if the key released is up, down, left or right.
            # Setting Boolean values back to False. 
            if event.key == pygame.K_UP:
                keyUp = False
            if event.key == pygame.K_DOWN:
                keyDown = False
            if event.key == pygame.K_LEFT:
                keyLeft = False
            if event.key == pygame.K_RIGHT:
                keyRight = False 

    # Setting movement values for the player character if the up, down, left or right keys are pressed.
    if keyUp == True:
        if player_Y > 0 :  # Ensuring the player does not move out the top of the screen.
            player_Y -= 1
    if keyDown == True:
        if player_Y < screen_height - player_height:  # Ensuring the player does not move beyond the screen bottom.
            player_Y += 1
    if keyLeft == True:
        if player_X > 0:  #  Ensuring the player does not move beyond the left side of the screen.
            player_X -= 1
    if keyRight == True:
        if player_X < screen_width - player_width:  # Ensuring the player does not move beyond the right side of the screen. 
            player_X += 1

    # Creating bounding boxes for all character images.
    # This will enable actions to occur when the player collides with an enemy or the prize.
    playerBox = pygame.Rect(player.get_rect())
    enemy_1Box = pygame.Rect(enemy_1.get_rect())
    enemy_2Box = pygame.Rect(enemy_2.get_rect())
    enemy_3Box = pygame.Rect(enemy_3.get_rect())
    prizeBox = pygame.Rect(prize.get_rect())

    # Updating playerBox position to characters' x and y positions.
    playerBox.top = player_X
    playerBox.left = player_Y
    enemy_1Box.top = enemy_1X
    enemy_1Box.left = enemy_1Y
    enemy_2Box.top = enemy_2X
    enemy_2Box.left = enemy_2Y
    enemy_3Box.top = enemy_3X
    enemy_3Box.left = enemy_3Y
    prizeBox.top = prize_X
    prizeBox.left = prize_Y

    # Testing collision of the player box with enemy boxes.
    if playerBox.colliderect(enemy_1Box) or playerBox.colliderect(enemy_2Box) or playerBox.colliderect(enemy_3Box):

        # Display losing status to the user.
        print("You lose")

        # Quitting the game and exiting the window.
        pygame.quit()
        exit(0)

    if playerBox.colliderect(prizeBox):

        # Display winning status to the user.
        print("You win")

        # Quitting the game and exiting the window.
        pygame.quit()
        exit(0)
        
    # If the prize exits the window before the user reaches it, they lose the game.
    if prize_Y < 0 - prize_width:
        
        # Displaying loser status.
        print("You lose")
        
        # Quitting the game and exiting the window.
        pygame.quit()
        exit(0)

    # Making the enemy and prize characters approach the player.
    enemy_1X -= 0.15
    enemy_3Y += 0.3
    enemy_2Y -= 0.1
    prize_Y -= 0.15
    














    




