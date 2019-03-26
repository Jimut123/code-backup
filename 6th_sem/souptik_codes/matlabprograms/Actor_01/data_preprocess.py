#!/usr/bin/env python3
# -*- coding: utf-8 -*-
#data preprocessing
"""
Created on Sat Nov 24 11:59:52 2018

@author: souptik
"""
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

#import dataset
#working directory
dataset=pd.read_csv('Data.csv')
X=dataset.iloc[:,:-1].values
y=dataset.iloc[:,3].values             #.values for object type
#handling missing data
"""from sklearn.preprocessing import Imputer # scikit learn for ml models 
imputer=Imputer(missing_values="NaN",strategy="mean",axis=0)
imputer=imputer.fit(X[:,1:3])
X[:,1:3]=imputer.transform(X[:,1:3])"""
#encoding categorical data
"""from sklearn.preprocessing import LabelEncoder,OneHotEncoder # for labelling categorical data
labelencoder_X =LabelEncoder()
X[:,0]=labelencoder_X.fit_transform(X[:,0])
create dummy variables
onehotencoder=OneHotEncoder(categorical_features=[0])
X=onehotencoder.fit_transform(X).toarray()
labelencoder_y=LabelEncoder()
y=labelencoder_y.fit_transform(y)"""

#dataset split into training and test set
from sklearn.model_selection import train_test_split #cross_validation--> model_selection
X_train,X_test,y_train,y_test = train_test_split(X,y,test_size=0.2,random_state=0)
#Feature Scaling
"""from sklearn.preprocessing import StandardScaler
sc_X=StandardScaler()
X_train=sc_X.fit_transform(X_train)
X_test=sc_X.transform(X_test) #already fitted  during training set"""


