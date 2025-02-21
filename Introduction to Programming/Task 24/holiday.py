# This function will take the number of nights a user
# will be staying at a hotel as an argument, and return a total cost for
# the hotel stay.

def hotel_cost(nights):
    return nights * 875

# This function will take the city you are flying to as an
# argument and return a cost for the flight
# We made use of the if/else statement.

def plane_cost(city):
    ticket = 0
    while city == 3:
        if city == '1':
            ticket = 750
            break

        elif city == '2':
            ticket = 850
            break

        elif city == '3':
            ticket = 600
            break

        else:
            print ('You have selected an invalid option')

    return ticket

#This function will take the number of days the car will
#be hired for as an argument and returns the total cost of the car
#rental.

def car_rental(days):
    return days * 275

# This function will take three arguments: the
# number of nights a user will be staying in a hotel, the city the user
# will be flying to and the number of days that the user will be hiring
# a car for.

def holiday_cost(nights, city, days):
    nights = hotel_cost(nights)
    city = plane_cost(city)
    days = car_rental(days)
    return nights + city + days

nights = int(input('How many nights will you be staying? '))
city = input('\n1. O.R. Tambo International\n2. Capetown International\n3. King Shaka International\nWhere you flying to? ')
days = int(input('How many days will you need a car for?: '))

# All the details about the holiday
total = holiday_cost(nights, city, days)
print (total)