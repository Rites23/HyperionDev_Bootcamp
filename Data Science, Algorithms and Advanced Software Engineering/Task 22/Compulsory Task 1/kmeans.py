import csv
import numpy as np
import matplotlib.pyplot as plt


# Computes the distance between two data points


def calc_distance(data_point1, data_point2):
    return (np.sum((data_point1 - data_point2) ** 2)) ** 0.5


# Function to read data from the csv files


def read_csv(filename):
    with open(filename) as filehandler:
        read_data = csv.DictReader(filehandler, delimiter=',')
        data = []
        for row in read_data:
            data.append(row)
    values = [list(dictionary.values())[1:] for dictionary in data]

    # Convert the data into float for processing

    values = [list(map(float, value)) for value in values]
    return values


# Define a function that finds the closest centroid to each point out of all the centroids


def closest_centroid(data, centroids):
    # Assign centroid to data points by using a dictionary with centroid index as key and its data points as value
    assigned_centroid = {}
    for j in range(len(centroids)):
        assigned_centroid[j] = []
    for i in data:
        distance = []

        # Calculate distance to all centroids
        for j in centroids:
            distance.append(calc_distance(np.array(i), np.array(j)))

        # Use numpy argmin the useful method to find index of the smallest value in distance array which
        # corresponds to index of centroid
        assigned_centroid[np.argmin(distance)].append(i)
    return assigned_centroid


# Make a function to visualise the clusters. (optional, but useful to see the changes and if your algorithm is working)


def plot_clusters(assign_data, centroids, iter):
    plt.figure()
    plt.scatter(np.array(centroids)[:, 0], np.array(centroids)[:, 1], color='black')
    for i in range(len(centroids)):
        plt.scatter(np.array(assign_data[i])[:, 0], np.array(assign_data[i])[:, 1], alpha=0.2)

    # plt.scatter(np.array(data)[:, 0], np.array(data)[:, 1], alpha=0.1)
    plt.xlabel("Birth rate")
    plt.ylabel("Life Expectancy")
    plt.title(f"Centroids and clusters in iteration = {iter + 1}")
    plt.savefig(f"Cluster_{iter}.png")
    print(f"Plot has been saved to Cluster_{iter}.png")
    # plt.show()


# Make the initialisation procedure
# Dataset you want to analyse
filename = 'dataBoth.csv'

# Define number of clusters 
numClusters = 3
while True:
    try:
        numClusters = int(input("Please enter the Number of Clusters: "))
        break
    except ValueError:
        print("Please enter a valid Number of Clusters: ")
# No of iterations
max_iter = 6

while True:
    try:
        max_iter = int(input("Please enter the Number of Iterations: "))
        break
    except ValueError:
        print("Please enter a valid Number of Clusters: ")

# Get data and Initialize Centroids. (X is dataBoth.csv)
X = read_csv(filename)
centroids_idx = np.random.choice(len(X), numClusters)
centroids = []
for idx in centroids_idx:
    centroids.append(X[idx])

# Implement the k-means algorithm, using the appropriate looping for the number of iterations.

# --- Find the closest centroid to each point and assign the point to that centroid's cluster

# --- Calculate the new mean of all points in that cluster

# --- Visualize (optional, but useful to see the changes)

# ---- Repeat

for i in range(max_iter):
    # Closest centroid to each points
    assign_centroids = closest_centroid(X, centroids)
    # Calculate new mean and update centroids_idx
    new_centroids = [np.mean(assign_centroids[centroid], axis=0) for centroid in assign_centroids.keys()]
    # Visualize cluster for each  iteration
    plot_clusters(closest_centroid(X, new_centroids), new_centroids, i)
    centroids = new_centroids
# ====

# Print out the results for questions

# 1) The number of countries belonging to each cluster

# 2) The list of countries belonging to each cluster

# 3) The mean Life Expectancy and Birth Rate for each cluster

# Final Data and their clusters
final_cluster_data = closest_centroid(X, centroids)
# Print the required in the question
for i in range(len(centroids)):
    print(f"Number of countries in cluster with centroid {centroids[i]} = {len(final_cluster_data[i])}")

# Get countries data 
data = []
with open(filename) as filehandler:
    read_data = csv.DictReader(filehandler, delimiter=',')
    for row in read_data:
        data.append(list(row.values()))

for i in range(len(centroids)):
    print(f"\nCountries in cluster with centroid {centroids[i]}\n")
    for j in final_cluster_data[i]:
        country = [values[0] for values in data if values[1] == str(j[0]) and values[2] == str(j[1])]
        if len(country) > 0:
            print(country[0])
for i in range(len(centroids)):
    print(f"The mean Life Expectancy and Birth Rate for cluster with centroid:")
    print(
        f"{centroids[i]} = {round(np.mean(final_cluster_data[i], axis=0)[1], 3)},"
        f"{round(np.mean(final_cluster_data[i], axis=0)[0],3)}")