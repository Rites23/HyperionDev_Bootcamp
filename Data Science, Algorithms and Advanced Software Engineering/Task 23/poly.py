import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.preprocessing import PolynomialFeatures

# we have 18 aeroplanes passing through a certain area at different speeds. 
x = [1,2,3,5,6,7,8,9,10,12,13,14,15,16,18,19,21,22]
y = [730,700,690,660,660,600,660,700,750,750,760,770,780,790,900,940,940,730]
  
#Method for polynomial model:
polynomial_model = np.poly1d(np.polyfit(x,y,3))

#Start at position 1, and end at position 22 
line = np.linspace(1, 22, 100)

plt.scatter(x, y)
plt.plot(line, polynomial_model(line))
plt.show() 

poly = PolynomialFeatures(degree=2)
X_F1_poly = poly.fit_transform(X_F1)

X_train, X_test, y_train, y_test = train_test_split(X_F1_poly, y_F1, random_state = 0)

regressor = LinearRegression().fit(X_train, y_train)
