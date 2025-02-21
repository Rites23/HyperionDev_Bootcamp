# 
def load_numbers(filepath):
    with open(filepath, 'r') as file:
        return [int(n) for n in file.readlines()]


if __name__ == '__main__':
    first_numbers = load_numbers('numbers1.txt')
    second_numbers = load_numbers('numbers2.txt')

    sorted_numbers = sorted(first_numbers + second_numbers)

    with open('all_numbers.txt', 'w') as file:
        file.writelines(sorted_numbers)


