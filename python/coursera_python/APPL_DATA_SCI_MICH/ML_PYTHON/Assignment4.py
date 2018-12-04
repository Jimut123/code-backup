
# coding: utf-8

# # Assignment 4
# 
# Before working on this assignment please read these instructions fully. In the submission area, you will notice that you can click the link to **Preview the Grading** for each step of the assignment. This is the criteria that will be used for peer grading. Please familiarize yourself with the criteria before beginning the assignment.
# 
# This assignment requires that you to find **at least** two datasets on the web which are related, and that you visualize these datasets to answer a question with the broad topic of **religious events or traditions** (see below) for the region of **Ann Arbor, Michigan, United States**, or **United States** more broadly.
# 
# You can merge these datasets with data from different regions if you like! For instance, you might want to compare **Ann Arbor, Michigan, United States** to Ann Arbor, USA. In that case at least one source file must be about **Ann Arbor, Michigan, United States**.
# 
# You are welcome to choose datasets at your discretion, but keep in mind **they will be shared with your peers**, so choose appropriate datasets. Sensitive, confidential, illicit, and proprietary materials are not good choices for datasets for this assignment. You are welcome to upload datasets of your own as well, and link to them using a third party repository such as github, bitbucket, pastebin, etc. Please be aware of the Coursera terms of service with respect to intellectual property.
# 
# Also, you are welcome to preserve data in its original language, but for the purposes of grading you should provide english translations. You are welcome to provide multiple visuals in different languages if you would like!
# 
# As this assignment is for the whole course, you must incorporate principles discussed in the first week, such as having as high data-ink ratio (Tufte) and aligning with Cairo’s principles of truth, beauty, function, and insight.
# 
# Here are the assignment instructions:
# 
#  * State the region and the domain category that your data sets are about (e.g., **Ann Arbor, Michigan, United States** and **religious events or traditions**).
#  * You must state a question about the domain category and region that you identified as being interesting.
#  * You must provide at least two links to available datasets. These could be links to files such as CSV or Excel files, or links to websites which might have data in tabular form, such as Wikipedia pages.
#  * You must upload an image which addresses the research question you stated. In addition to addressing the question, this visual should follow Cairo's principles of truthfulness, functionality, beauty, and insightfulness.
#  * You must contribute a short (1-2 paragraph) written justification of how your visualization addresses your stated research question.
# 
# What do we mean by **religious events or traditions**?  For this category you might consider calendar events, demographic data about religion in the region and neighboring regions, participation in religious events, or how religious events relate to political events, social movements, or historical events.
# 
# ## Tips
# * Wikipedia is an excellent source of data, and I strongly encourage you to explore it for new data sources.
# * Many governments run open data initiatives at the city, region, and country levels, and these are wonderful resources for localized data sources.
# * Several international agencies, such as the [United Nations](http://data.un.org/), the [World Bank](http://data.worldbank.org/), the [Global Open Data Index](http://index.okfn.org/place/) are other great places to look for data.
# * This assignment requires you to convert and clean datafiles. Check out the discussion forums for tips on how to do this from various sources, and share your successes with your fellow students!
# 
# ## Example
# Looking for an example? Here's what our course assistant put together for the **Ann Arbor, MI, USA** area using **sports and athletics** as the topic. [Example Solution File](./readonly/Assignment4_example.pdf)

# In[179]:

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns


get_ipython().magic('matplotlib notebook')

sns.set_style('white')

df2000 = pd.read_csv(r'./2000data.csv').drop(['Family', 'Congregations', 'Adherence Rate†'], axis=1)
df2000 = df2000.rename(index=str, columns={'Adherents':'Adherents2000'})


df2000['Adherents2000'] = df2000['Adherents2000'].str.replace(',', '')
df2000['Adherents2000'] = df2000['Adherents2000'].replace('---', 0)
df2000['Adherents2000'] = df2000['Adherents2000'].astype(float) 


#df2000 = df2000.groupby(['Tradition'])['Adherents2010'].sum()

df2010 = pd.read_csv(r'./2010data.csv').drop(['Family', 'Congregations', 'Adherence Rate†'], axis=1)
df2010 = df2010.rename(index=str, columns={'Adherents':'Adherents2010'})
df2010['Adherents2010'] = df2010['Adherents2010'].str.replace(',', '')
df2010['Adherents2010'] = df2010['Adherents2010'].replace('---', np.NAN)
df2010['Adherents2010'] = df2010['Adherents2010'].astype(float) 

rlgsdata = pd.merge(df2010, df2000, how = 'outer', on=['Religious Bodies', 'Tradition'])

rlgsdata = rlgsdata.drop(['Religious Bodies'], axis=1)

rlgsdata = rlgsdata.groupby(['Tradition']).sum()
#rlgsdata = rlgsdata.reset_index

fig, ax = plt.subplots()

xvals = range(len(rlgsdata))
plt.bar(xvals, rlgsdata['Adherents2000'], width = 0.3, color = 'cornflowerblue', alpha=0.7)
new_xvals = []

for item in xvals:
    new_xvals.append(item+0.3)
    
plt.bar(new_xvals, rlgsdata['Adherents2010'], width = 0.3 ,color='seagreen', alpha=0.7)
plt.xticks(xvals, ('Black Protestant', 'Catholic', 'Evangelical Protestant', 'Mainline Protestant', 'Orthodox', 'Other'), size=6)


ax.set_ylabel('Total Adherents', alpha=0.7)
ax.set_title('Comparison of 2000 and 2010 Religious Adherents of Ann Arbor, MI, USA', alpha=0.7)

ax.legend(('2000 Adherents Total', '2010 Adherents Total'), loc=1)
ax.spines['top'].set_visible(False)
ax.spines['right'].set_visible(False)



# In[112]:




# In[ ]:



