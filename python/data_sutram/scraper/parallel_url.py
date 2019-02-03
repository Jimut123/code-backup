import os
import requests
from time import time as timer
from multiprocessing.pool import ThreadPool

def fetch_url(entry):
    path, uri = entry
    try:
        if not os.path.exists(path):
            r = requests.get(uri, stream=True)
            if r.status_code == 200:
                with open(path, 'wb') as f:
                    for chunk in r:
                        f.write(chunk)
    except: 
        pass
    return path
    #print(path)
urls = [
    ("1.html", "https://markhneedham.com/blog/2018/07/10/neo4j-grouping-datetimes/"),
    ("2.html", "https://markhneedham.com/blog/2018/07/09/neo4j-text-cannot-be-parsed-to-duration/"),
    ("3.html", "https://markhneedham.com/blog/2018/06/15/neo4j-querying-strava-graph-py2neo/"),
    ("4.html", "https://markhneedham.com/blog/2018/06/12/neo4j-building-strava-graph/"),
    ("5.html", "ps://markhneedham.com/blog/2018/06/05/neo4j-apoc-loading-data-strava-paginated-json-api/"),
    ("6.html", "https://markhneedham.com/blog/2018/06/03/neo4j-3.4-gotchas-working-with-durations/"),
    ("7.html", "https://markhneedham.com/blog/2018/06/03/neo4j-3.4-formatting-instances-durations-dates/"),
    ("8.html", "https://markhneedham.com/blog/2018/06/02/neo4j-3.4-comparing-durations/"),
    ("9.html", "https://markhneedham.com/blog/2018/05/19/interpreting-word2vec-glove-embeddings-sklearn-neo4j-graph-algorithms/"),
    ("10.html", "tps://markhneedham.com/blog/2018/05/11/node2vec-tensorflow/")
]

start = timer()
"""
for entry in urls:
    fetch_url(entry)

print(f"Elapsed Time: {timer() - start}")
"""
results = ThreadPool(8).imap_unordered(fetch_url, urls)

for path in results:
    print(path)

print(f"Elapsed Time: {timer() - start}")