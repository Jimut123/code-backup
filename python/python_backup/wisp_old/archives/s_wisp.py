"""
#   This is the application (probably basic) to find the location (almost any) in any Country 
#   according to the choices of your preference. Uses Foursquare API to get the data (geojson),
#   also uses shitty tkinter GUI for accepting data. Please provide the Access key for the API
#   if bychance not given! This then creates a custom-made http server to visualise the locations
#   in a web browser, because Folium (leaflet.js) doesn't work in GUI or Terminal LOL!
#   
#   Caution: Please don't blame me if this doesn't works, cause the data may not be present for 
#            some location, since everyone will use free services of foursquare API.
#
#   @Copyright :: Don't share this software without the permission of the author
#
#   e-mail : jimutbahanpal@yahoo.com
#   
#   Created for the purpose of final year project! :=> Almost data visualization project!
#
#   Dated : 10-02-2019
"""
__version__ = "0.0.1-beta"
__author__ = "Jimut Bahan Pal <jimutbahanpal@yahoo.com>"

from tkinter import Tk, Label, Button, Entry, StringVar, DISABLED, NORMAL, END, W, E, N, S
# tranforming json file into a pandas dataframe library
from http.server import BaseHTTPRequestHandler, HTTPServer
from pandas.io.json import json_normalize
from folium.plugins import MarkerCluster
from tempfile import NamedTemporaryFile
from geopy.geocoders import Nominatim # module to convert an address into latitude and longitude values
from IPython.core.display import HTML 
from IPython.display import Image
from tkinter import *
import tkinter as tk
import pandas as pd # library for data analsysis
import numpy as np # library to handle data in a vectorized manner
import subprocess
import webbrowser
import requests # library to handle requests
import random # library for random number generation
import folium # plotting library

print('Folium installed')
print('Libraries imported.')
def_sec_dummy = 0
class guiProj:
    def __init__(self, master):
        # the constructor for creating the GUI of the app using tkinter!
        # this is creating the padding for the input/label text etc.
        for i in range(100):
            master.columnconfigure(i, pad=3)    
            master.rowconfigure(i, pad=3)
        self.master = master
        master.title("WISP")
        # probably the do-able geometry
        master.geometry("350x600")

        # Shortened version of the code!
        msg_s = ["CLIENT ID","FOURSQUARE SECRET","LOC/CITY","RADIUS (in meters)","NO. OF PREFERENCE"]
        i_var = 0

        # just initializing!
        self.msg_list = [None]*int(5)
        self.text_list = [None]*int(5)
        self.label_list = [None]*int(5)
        self.entry_list = [None]*int(5)

        # creating the basic template of the application!
        for msg in msg_s:
            self.msg_list[i_var] = msg
            self.text_list[i_var] = StringVar()
            self.text_list[i_var].set("{}".format(self.msg_list[i_var]))
            self.label_list[i_var] = Label(master, textvariable=self.text_list[i_var])
            self.label_list[i_var].grid(row=i_var, column=0, columnspan=1, sticky=W+N)

            self.entry_list[i_var] = Entry(master)
            self.entry_list[i_var].grid(row=i_var, column=1, columnspan=1, sticky=W+N)
            
            i_var += 1
        
        def submit_pref():
            # this function gets called when they submit the preference!
            get_pref_no = self.entry_list[4].get()  #to get the preference
            # dummy preference for conditional check later
            if get_pref_no == "":
                get_pref_no = 0
            # initialising etc.
            self.entry_pref = [None]*int(get_pref_no)
            self.text_pref = [None]*int(get_pref_no)
            self.pf_text = [None]*int(get_pref_no)
            self.label_pref = [None]*int(get_pref_no)


            def onFrameConfigure(canvas):
                '''Reset the scroll region to encompass the inner frame'''
                canvas.configure(scrollregion=canvas.bbox("all"))
            
            def populate(frame):
                '''Put in some fake data'''
                # automating the boring and tedious stuffs through list
                # basically, takes the input for the number of preferences!
                for iter_ in range(int(get_pref_no)):
                    
                    text_str = "{}-{} :".format("preference",iter_+1)
                    
                    self.pf_text[iter_] = text_str
                    # creating the label
                    self.text_pref[iter_] = StringVar()
                    self.text_pref[iter_].set(self.pf_text[iter_])
                    self.label_pref[iter_] = Label(frame, textvariable=self.text_pref[iter_])
                    self.label_pref[iter_].grid(row=5+iter_+1, column=0, columnspan=1, sticky=W+N)

                    # entry widget
                    self.entry_pref[iter_] = Entry(frame)
                    self.entry_pref[iter_].grid(row=5+iter_+1, column=1, columnspan=1, sticky=W+N)
                """
                for row in range(100):
                    tk.Label(frame, text="%s" % row, width=3, borderwidth="1", 
                            relief="solid").grid(row=row, column=0)
                    t="this is the second column for row %s" %row
                    tk.Label(frame, text=t).grid(row=row, column=1)
                    tk.Entry(frame).grid(row=row, column=2)
                """
            
            canvas = tk.Canvas(master, borderwidth=0, background="#ffffff")
            frame = tk.Frame(canvas, background="#ffffff")
            vsb = tk.Scrollbar(master, orient="vertical", command=canvas.yview)
            canvas.configure(yscrollcommand=vsb.set)
            vsb.grid(row=4, column=4, rowspan=int(get_pref_no), sticky="nsew")
            canvas.grid(row=7,column=0,rowspan=1,sticky="nsew")
            canvas.create_window((4,4), window=frame, anchor="nw")
            frame.bind("<Configure>", lambda event, canvas=canvas: onFrameConfigure(canvas))
            populate(frame)
            """
            
            
            
            """
            # disabling the button! for one-time use!
            self.submit_pref_buttton.configure(state=DISABLED)

            self.show_map_button = Button(master, text="show map",command=self.show_map)
            self.show_map_button.grid(row=int(get_pref_no)+5+1,column=2,columnspan=1, sticky=S+W)

        def def_sec():
            # this function sets the default secrets!

            global def_sec_dummy
            def_sec_dummy = 1
            print("USING DEFAULT SECRETS FOR CLIENT_ID and CLIENT_SECRET ")
            self.entry_list[0].insert(END, 'using default client ID')
            self.entry_list[1].insert(END, 'using default client secret')
            # disabling things! lol
            self.use_default_sec.configure(state=DISABLED)
        # place holder gets called when we use this! (default secret thingie)
        self.use_default_sec = Button(master, text="use default secrets",command=def_sec)
        self.use_default_sec.grid(row=5,column=0,columnspan=1, sticky=W+E)
        # again button thing
        self.submit_pref_buttton = Button(master, text="submit",command=submit_pref)
        self.submit_pref_buttton.grid(row=5,column=1,columnspan=1, sticky=W+E)
    
    def show_map(self):
        # To get all the values and show the map!
        all_values = []     # has all the values that is got from the GUI
        for item in self.entry_list:
            all_values.append(item.get())
        pref_list = []      # gets the preference one by one!
        for item in self.entry_pref:
            pref_list.append(item.get())
        #print(all_values)
        string_gen = "0123456789abcdef"     # this actually generated the random hex code for colors!
        def get_random_col():
            # unnecessary stuffs to make the visualization cool
            ret_str = "#"
            for i in range(6):
                ret_str += random.choice(string_gen)
            return ret_str
        #get_random_col()
        global def_sec_dummy
        if def_sec_dummy == 1:
            # default things! lol make sure to clear them!!!!
            CLIENT_ID = "QGITIC5BRJSPQFIEDOINIWZUBWBUX3JUGOAJO2H1KC1HPT1T"
            CLIENT_SECRET = "2FJXKPKYOMK4DISKLHL4DI111FPZYCTZIZW2IF55VCLK0WJF"
        elif def_sec_dummy == 0:
            CLIENT_ID = all_values[0]                   #input("Enter the client ID : ") # your Foursquare ID
            # QGITIC5BRJSPQFIEDOINIWZUBWBUX3JUGOAJO2H1KC1HPT1T
            CLIENT_SECRET = all_values[1]               #input("Enter the Foursquare secret : ") # your Foursquare Secret
            # 2FJXKPKYOMK4DISKLHL4DI111FPZYCTZIZW2IF55VCLK0WJF
        VERSION = '20190122'
        LIMIT = 1000
        address = all_values[2]                                   #input("Enter the location/ city :")

        print('Your credentails:')
        print('CLIENT_ID: ' + CLIENT_ID)
        print('CLIENT_SECRET:' + CLIENT_SECRET)
        print('Location of your choice : ', address)

        geolocator = Nominatim()
        try:
            # get's the lat and long for a place, it is kept under try catch for safety purpose
            location = geolocator.geocode(address)
            latitude = location.latitude
            longitude = location.longitude
            print(latitude, longitude)
        except:

            print("CHECK INTERNET CONNECTION!")
            # directly closes the application
            exit(4)

        
        RADIUS = int(all_values[3])

        print("Total preference list : ",pref_list)

        map_address = folium.Map(location=[latitude, longitude], zoom_start=11)
        marker_cluster = MarkerCluster().add_to(map_address)
        list_df = []
        for item_pref in pref_list:
            url = 'https://api.foursquare.com/v2/venues/search?client_id={}&client_secret={}&ll={},{}&v={}&query={}&radius={}&limit={}'.format(CLIENT_ID, CLIENT_SECRET, latitude, longitude, VERSION, item_pref, RADIUS, LIMIT)
            try :
                print("url : ",url)
                results = requests.get(url).json()
                # assign relevant part of JSON to venues
                venues = results['response']['venues']

                # tranform venues into a dataframe
                dataframe = json_normalize(venues)
                print(dataframe.head())
                try:
                    # keep only columns that include venue name, and anything that is associated with location
                    filtered_columns = ['name', 'categories'] + [col for col in dataframe.columns if col.startswith('location.')] + ['id']
                    dataframe_filtered = dataframe.loc[:, filtered_columns]
                except:
                    print("Something went wrong!")
                    continue
                # function that extracts the category of the venue
                def get_category_type(row):
                    try:
                        categories_list = row['categories']
                    except:
                        categories_list = row['venue.categories']

                    if len(categories_list) == 0:
                        return None
                    else:
                        return categories_list[0]['name']

                # filter the category for each row
                try:
                    dataframe_filtered['categories'] = dataframe_filtered.apply(get_category_type, axis=1)
                except:
                    print("Something went wrong!")
                    continue

                # clean column names by keeping only last term
                dataframe_filtered.columns = [column.split('.')[-1] for column in dataframe_filtered.columns]

                #dataframe_filtered.head()

                # copying it to stationary shop dataframe

                data_frame = dataframe_filtered.copy()
                list_df.append(data_frame)
            except:
                print("Preference : ",item_pref," doesn't exists!!!")
        print(list_df)
        # create map latitude and longitude values
        MAP_FINAL = folium.Map(location=[latitude, longitude], zoom_start=11)
        # configuration for the dafault map to be created!
        marker_cluster = MarkerCluster().add_to(MAP_FINAL)
        for list_item in list_df:
            FILL_COL = str(get_random_col())
            OVER_COL = str(get_random_col())
            for lat, lng, cat, postcode in zip(list_item['lat'], list_item['lng'],  list_item['categories'],  list_item['postalCode']):
                f_format = str("POSTCODE : "+str(postcode))
                s_format = str("CATEGORY : "+str(cat))
                label = '{}, {}'.format(f_format,s_format )
                label = folium.Popup(label, parse_html=True)
                # the circle marker is done through this way! with custom pop-ups
                folium.CircleMarker(
                    [lat, lng],
                    radius=5,
                    popup=label,
                    color=OVER_COL,
                    fill=True,
                    fill_color=FILL_COL,
                    fill_opacity=0.7).add_to(marker_cluster)  
        
        # setting port addr, localhost for the custom http server
        PORT = 7000
        HOST = '127.0.0.1'
        SERVER_ADDRESS = '{host}:{port}'.format(host=HOST, port=PORT)
        FULL_SERVER_ADDRESS = 'http://' + SERVER_ADDRESS
        # ------------------------------------------------------------------------------------------------
        # so let's write a custom temporary-HTML renderer
        def TemproraryHttpServer(page_content_type, raw_data):
            """
            A simpe, temprorary http web server on the pure Python 3.
            It has features for processing pages with a XML or HTML content.
            """

            class HTTPServerRequestHandler(BaseHTTPRequestHandler):
                """
                An handler of request for the server, hosting XML-pages.
                """

                def do_GET(self):
                    """Handle GET requests"""

                    # response from page
                    self.send_response(200)

                    # set up headers for pages
                    content_type = 'text/{0}'.format(page_content_type)
                    self.send_header('Content-type', content_type)
                    self.end_headers()

                    # writing data on a page
                    self.wfile.write(bytes(raw_data, encoding='utf'))

                    return

            if page_content_type not in ['html', 'xml']:
                raise ValueError('This server can serve only HTML or XML pages.')

            page_content_type = page_content_type

            # kill a process, hosted on a localhost:PORT
            subprocess.call(['fuser', '-k', '{0}/tcp'.format(PORT)])

            # Started creating a temprorary http server.
            httpd = HTTPServer((HOST, PORT), HTTPServerRequestHandler)

            # run a temprorary http server
            httpd.serve_forever()


        def run_html_server(html_data=None):

            if html_data is None:
                html_data = """
                <!DOCTYPE html>
                <html>
                <head>
                <title>Page Title</title>
                </head>
                <body>
                <h1>This is a Heading</h1>
                <p>This is a paragraph.</p>
                </body>
                </html>
                """

            # open in a browser URL and see a result
            webbrowser.open(FULL_SERVER_ADDRESS)

            # run server
            TemproraryHttpServer('html', html_data)

        # ------------------------------------------------------------------------------------------------
        # now let's save the visualization into the temp file and render it
        tmp = NamedTemporaryFile()
        MAP_FINAL.save(tmp.name)
        with open(tmp.name) as f:
            folium_map_html = f.read()

        run_html_server(folium_map_html)

def main():
    root = Tk()
    # initialising the app
    my_gui = guiProj(root)
    # goes on and on loop for tkinter!
    root.mainloop()

if __name__ == "__main__":
    main()
