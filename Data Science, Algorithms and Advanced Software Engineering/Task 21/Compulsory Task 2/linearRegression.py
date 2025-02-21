import numpy as np 
import matplotlib.pyplot as plt

from sklearn.datasets import load_diabetes
from sklearn.linear_model import LinearRegression

# Regression function
def Linear_Regression(X,y):
  x_mean=np.mean(X)
  y_mean=np.mean(y)
  m=np.dot(np.transpose(X-x_mean),y-y_mean)/np.dot(np.transpose(X-x_mean),X-x_mean)
  b=y_mean-m*x_mean
  return [m,b]

# Loading and preprocessing data
df=load_diabetes()
X = df.data[:, np.newaxis, 2]
y=df.target
X_train = X[:-20]
y_train = df.target[:-20]
X_test = X[-20:]
y_test = df.target[-20:]

# Prediction
m,b=Linear_Regression(X_train,y_train)
y_pred=b+m*X

# Plotting data
plt.scatter(X_train,y_train,c='r')
plt.scatter(X_test,y_test,c='g')
plt.plot(X,y_pred,c='b')
plt.show()