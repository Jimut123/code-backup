"""
#   This is the application (probably basic) to find the location (almost any) in any Country 
#   according to the choices of your preference. Uses Foursquare API to get the data (geojson),
#   also uses tkinter GUI for accepting data. Please provide the Access key for the API
#   if bychance not given! This then creates a custom-made http server to visualise the locations
#   in a web browser, because Folium (leaflet.js) doesn't work in GUI or Terminal.
#   
#   Caution: Please don't blame me if this doesn't works, cause the data may not be present for 
#            some location, since everyone will use free services of foursquare API.
#
#   @Copyright :: Don't share this software without the permission of the author
#
#   e-mail : jimutbahanpal@yahoo.com
#   website : https://jimut123.github.io
#   Created for the purpose of final year project! :=> Almost data visualization project!
#   
#   Dated : 10-02-2019
"""

__version__ = "0.0.8-beta"
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
from datetime import datetime
from tkinter import *
import tkinter as tk
import pandas as pd # library for data analsysis
import numpy as np # library to handle data in a vectorized manner
import subprocess
import webbrowser
import requests # library to handle requests
import argparse
import random # library for random number generation
import folium # plotting library
import json
import os

# print('Folium installed')
# print('Libraries imported.')

parser = argparse.ArgumentParser()
parser.add_argument("-q","--quiet", help="will not display anything in the terminal",
                    action="store_true")
parser.add_argument("-t","--theme", help="to select theme [1] classic [2] light [3] dark",choices=[1, 2, 3],
                    type=int)
parser.add_argument("-v","-V","--version", help="displays version",
                    action="store_true")
args = parser.parse_args()
"""
if not args.quiet:
    print("NOT QUIET")
if args.theme == None:
    print("USING DEFAULT THEME")
else:
    print("THEME : ",args.theme)
"""

if args.version:
    print("version 0.0.8-beta Jimut (TM)")
else:
    if not args.quiet:
        print('Starting application ... Necessary libraries imported.')



    if args.theme == None or args.theme == 1:
        # print("USING DEFAULT THEME")
        # defining JIMUT's classic theme for wisp : 
        color_bg_app = "#ffd700"
        color_msg = "#ffd700"
        color_msg_fg = "#000000"
        color_dropdown_fg = "#000000"
        color_dropdown = "#cfc611"
        color_savemap_label = "#ffd700"
        color_savemap_label_fg = "#000000"
        color_label_select_map_fg = "#000000"
        color_label_select_map = "#ffd700"
        color_save_map_entry = "#ffffff"
        color_save_map_entry_fg = "#000000"
        color_entry_default = "#ffffff"
        color_entry_default_fg = "#000000"
        color_use_def_sec_button = "#ffff00"
        color_use_def_sec_button_fg = "#000000"
        color_submit_button = "#ffff00"
        color_submit_button_fg = "#000000"
        color_preference_label = "#ffd700"
        color_preference_label_fg = "#000000"
        color_preference_canvas = "#ffd700"
        color_preference_entry = "#ffffff"
        color_preference_entry_fg = "#000000"
        color_show_map_button = "#ffff00"
        color_show_map_button_fg = "#000000"
        color_pref_scrollbar = "#8b4513"

    elif args.theme == 2:
        #print("THEME : ",args.theme)
        # defining JIMUT's light theme for wisp: 
        color_bg_app = "#7fffd4"
        color_msg = "#7fffd4"
        color_msg_fg = "#000000"
        color_dropdown_fg = "#000000"
        color_dropdown = "#7dcea0"
        color_savemap_label = "#7fffd4"
        color_savemap_label_fg = "#000000"
        color_label_select_map_fg = "#000000"
        color_label_select_map = "#7fffd4"
        color_save_map_entry = "#a1caf1"
        color_save_map_entry_fg = "#000000"
        color_entry_default = "#a1caf1"
        color_entry_default_fg = "#000000"
        color_use_def_sec_button = "#88d8c0"
        color_use_def_sec_button_fg = "#000000"
        color_submit_button = "#00cc99"
        color_submit_button_fg = "#000000"
        color_preference_label = "#afe4de"
        color_preference_label_fg = "#000000"
        color_preference_canvas = "#afe4de"
        color_preference_entry = "#bcd4e6"
        color_preference_entry_fg = "#000000"
        color_show_map_button = "#00fa9a"
        color_show_map_button_fg = "#000000"
        color_pref_scrollbar = "#50c878"

    elif args.theme == 3:
        # defining JIMUT's dark theme for wisp: 
        color_bg_app = "#253529"
        color_msg = "#253529"
        color_msg_fg = "#fefdfa"
        color_dropdown_fg = "#fefdfa"
        color_dropdown = "#07853b"
        color_savemap_label = "#253529"
        color_savemap_label_fg = "#fefdfa"
        color_label_select_map_fg = "#fefdfa"
        color_label_select_map = "#253529"
        color_save_map_entry = "#000000"
        color_save_map_entry_fg = "#fefdfa"
        color_entry_default = "#000000"
        color_entry_default_fg = "#fefdfa"
        color_use_def_sec_button = "#0a1195"
        color_use_def_sec_button_fg = "#fefdfa"
        color_submit_button = "#0a1195"
        color_submit_button_fg = "#fefdfa"
        color_preference_label = "#1e4d2b"
        color_preference_label_fg = "#fefdfa"
        color_preference_canvas = "#1e4d2b"
        color_preference_entry = "#000000"
        color_preference_entry_fg = "#fefdfa"
        color_show_map_button = "#0a1195"
        color_show_map_button_fg = "#fefdfa"
        color_pref_scrollbar = "#50c878"


    def_sec_dummy = 0

    # utils function for CLI

    def get_json_secrets():
        # this reads the secrets from the secret.txt file and returns them in tuple format!
        try:
            with open('secrets.txt', 'r') as f:
                array = json.load(f)
            if not args.quiet:
                print(array)
            # returns a tuple containing client id and client secret
            return str(array['client_id']),str(array['client_secret'])
        except:
            if not args.quiet:
                print("NO SECRETS PRESENT, please enter it in text file secrets.txt ...\n Else use the GUI to input secrets!")
            


    def time_now():
        format = "1;32;40"
        s1 = ''
        time_stmp = datetime.now().isoformat(timespec='seconds')
        s1 += '\x1b[%sm %s \x1b[0m' % (format, time_stmp)
        if not args.quiet:
            print("running app : {} ".format(s1),end="")



    def banner_wisp():
        format = "1;33;40"
        s1 = ''
        
        banner = """
    ██╗    ██╗██╗███████╗██████╗       
    ██║    ██║██║██╔════╝██╔══██╗       
    ██║ █╗ ██║██║███████╗██████╔╝        
    ██║███╗██║██║╚════██║██╔═══╝       
    ╚███╔███╔╝██║███████║██║                 
    ╚══╝╚══╝ ╚═╝╚══════╝╚═╝  	0.0.8-beta 
                    JIMUT(TM)  
            """
        s1 += '\x1b[%sm %s \x1b[0m' % (format, banner)
        if not args.quiet:
            print(s1)

    """
    parser = argparse.ArgumentParser()
    parser.add_argument('-save',action='store_true',dest='save_file_wisp',help='To save the output in <filename>.html',default=False)
    parser.add_argument('-h',action='store_true',dest='help_wisp',help='Help',default=False)
    args = parser.parse_args()
    if args.save_file_wisp == '-save':
        print("No output file specified")

    if args.help_wisp == '-h':
        print("LOL")
    """


    class guiProj:
        def __init__(self, master):
            banner_wisp()
            # the constructor for creating the GUI of the app using tkinter!
            # this is creating the padding for the input/label text etc.
            for i in range(100):
                master.columnconfigure(i, pad=3)    
                master.rowconfigure(i, pad=3)
            self.master = master
            master.title("WISP")
            # probably the do-able geometry
            master.geometry("430x460")

            # Shortened version of the code!
            msg_s = ["    CLIENT ID    ","    FOURSQUARE SECRET    ","    LOC/CITY    ","    RADIUS (in meters) >= 1000    ","    NO. OF PREFERENCE    "]
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
                self.label_list[i_var] = Label(master, textvariable=self.text_list[i_var],background=color_msg,foreground=color_msg_fg)
                self.label_list[i_var].grid(row=i_var, column=0, columnspan=1, sticky=W+E)

                self.entry_list[i_var] = Entry(master,background=color_entry_default,foreground=color_entry_default_fg)
                self.entry_list[i_var].grid(row=i_var, column=1, columnspan=1, sticky=W+E)
                
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
                        self.label_pref[iter_] = Label(frame, textvariable=self.text_pref[iter_],background=color_preference_label,foreground=color_preference_label_fg)
                        self.label_pref[iter_].grid(row=5+iter_+1, column=0, sticky=W+N)

                        # entry widget
                        self.entry_pref[iter_] = Entry(frame,background=color_preference_entry,foreground=color_preference_entry_fg)
                        self.entry_pref[iter_].grid(row=5+iter_+1, column=1, sticky=W+N)
                    """
                    for row in range(100):
                        tk.Label(frame, text="%s" % row, width=3, borderwidth="1", 
                                relief="solid").grid(row=row, column=0)
                        t="this is the second column for row %s" %row
                        tk.Label(frame, text=t).grid(row=row, column=1)
                        tk.Entry(frame).grid(row=row, column=2)
                    """
                
                canvas = tk.Canvas(master, borderwidth=0,background=color_preference_canvas)
                
                canvas.config(width=250, height=200)
                
                frame = tk.Frame(canvas,background=color_preference_canvas)
                vsb = tk.Scrollbar(master, orient="vertical", command=canvas.yview, background=color_pref_scrollbar)
                canvas.configure(yscrollcommand=vsb.set)
                # for the scrollbar
                vsb.grid(row=8, column=1,rowspan=int(get_pref_no), sticky="nsw")
                # for the grid
                canvas.grid(row=8,column=0,rowspan=1,sticky="nsew")
                canvas.create_window((4,4), window=frame, anchor="nw")
                frame.bind("<Configure>", lambda event, canvas=canvas: onFrameConfigure(canvas))
                populate(frame)
                # disabling the button! for one-time use!
                self.submit_pref_buttton.configure(state=DISABLED)

                MAP_TYPES = ["Mapbox Bright","Stamen Toner","Stamen Terrain","OpenStreetMap","Mapbox Control Room"]

                self.label_select_map = Label(master, text="SELECT MAP-TYPE",foreground=color_label_select_map_fg,background=color_label_select_map)
                self.label_select_map.grid(row=int(get_pref_no)+8,column=0,columnspan=1,sticky=W+E+N+S)
                self.dropdown_map_select = StringVar(master)
                self.dropdown_map_select.set(MAP_TYPES[0])
                
                # foreground=color_dropdown_fg,background=color_dropdown,
                self.dropdown_menu = OptionMenu(master,self.dropdown_map_select,*MAP_TYPES)
                # to set the color of the dropdown menu to a different color
                self.dropdown_menu.config(foreground=color_dropdown_fg,background=color_dropdown)

                self.dropdown_menu.grid(row=int(get_pref_no)+8,column=1,columnspan=1,sticky=W+E+N+S)
                # use dropdown_map_select.get() to get the contents of this list

                # now save the file's entry

                self.save_map = Label(master, text="SAVE MAP AS (OPTIONAL)",background=color_savemap_label,foreground=color_savemap_label_fg)
                self.save_map.grid(row=int(get_pref_no)+9,column=0,columnspan=1,sticky=W+E+N+S)

                # for the save map entry file
                self.save_map_entry = Entry(master,background=color_save_map_entry,foreground=color_save_map_entry_fg)
                self.save_map_entry.grid(row=int(get_pref_no)+9,column=1,columnspan=1, sticky=W+E)

                self.show_map_button = Button(master, text="show map",command=self.show_map,background=color_show_map_button,foreground=color_show_map_button_fg)
                self.show_map_button.grid(row=int(get_pref_no)+10,column=1,columnspan=1, sticky=W+E)




            def def_sec():
                # this function sets the default secrets!

                global def_sec_dummy

                
                try:
                    test1,test2 =get_json_secrets()
                    def_sec_dummy = 1
                    time_now()
                    if not args.quiet:
                        print("USING DEFAULT SECRETS FOR CLIENT_ID and CLIENT_SECRET ")
                    self.entry_list[0].insert(END, 'using default client ID')
                    self.entry_list[1].insert(END, 'using default client secret')
                    # disabling things! lol
                    self.use_default_sec.configure(state=DISABLED)
                except:
                    def_sec_dummy = 0
                    time_now()
                    if not args.quiet:
                        print("PLEASE ENTER SECRETS IN secrets.txt file in the current directory!")
                    time_now()
                    if not args.quiet:
                        print("QUITTING")
                    exit(4)
                
            # place holder gets called when we use this! (default secret thingie)
            self.use_default_sec = Button(master, text="use default secrets",command=def_sec,background=color_use_def_sec_button,foreground=color_use_def_sec_button_fg)
            self.use_default_sec.grid(row=5,column=0, sticky=W+E)
            # again button thing
            self.submit_pref_buttton = Button(master, text="submit",command=submit_pref,background=color_submit_button,foreground=color_submit_button_fg)
            self.submit_pref_buttton.grid(row=5,column=1,columnspan=1, sticky=W+E)

        
        def show_map(self):
            # fetching the name of the map to be save here too!
            time_now()
            global save_name_map
            try:
                save_name_map = str(self.save_map_entry.get())
                time_now()
                if save_name_map == "":
                    if not args.quiet:
                        time_now()
                        print("NO FILE NAME GIVEN!..\n SO NOT SAVING!")
                else:
                    if not args.quiet:
                        print("FILE NAME GOT !!: ",save_name_map)
            except:
                if not args.quiet:
                    time_now()
                    print("NO FILE NAME GIVEN!..\n SO NOT SAVING!")
                save_name_map=None

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
                # this takes the tuple returned from the get_json_secrets() function which reads secrets from secrets.txt file
                time_now()
                CLIENT_ID, CLIENT_SECRET = get_json_secrets()
                

            elif def_sec_dummy == 0:
                CLIENT_ID = all_values[0]                   #input("Enter the client ID : ") # your Foursquare ID
                CLIENT_SECRET = all_values[1]               #input("Enter the Foursquare secret : ") # your Foursquare Secret
                
            VERSION = '20190122'
            LIMIT = 1000
            address = all_values[2]                                   #input("Enter the location/ city :")
            time_now()
            if not args.quiet:
                print('Your credentails:')
                time_now()
                print('CLIENT_ID: ' + CLIENT_ID)
                time_now()
                print('CLIENT_SECRET:' + CLIENT_SECRET)
                time_now()
                print('Location of your choice : ', address)

            geolocator = Nominatim(timeout = 10)
            try:
                # get's the lat and long for a place, it is kept under try catch for safety purpose
                location = geolocator.geocode(address)
                latitude = location.latitude
                longitude = location.longitude
                if not args.quiet:
                    time_now()
                    print(latitude, longitude)
            except:
                if not args.quiet:
                    time_now()
                    print("CHECK INTERNET CONNECTION!\n ELSE YOUR NET IS NOT IN FULL 3/4G")
                # directly closes the application
                exit(4)

            
            RADIUS = int(all_values[3])
            if not args.quiet:
                time_now()
                print("Total preference list : ",pref_list)

            # To clean the list if by chance someone has given unnecessary values or empty values or unused text entry box
            pref_list = list(filter(None, pref_list))
            if not args.quiet:
                time_now()
                print("New pref list : ",pref_list)

            map_address = folium.Map(location=[latitude, longitude], zoom_start=11)
            marker_cluster = MarkerCluster().add_to(map_address)
            list_df = []
            

            col_fill = []
            col_border = []
            for item_pref in pref_list:
                url = 'https://api.foursquare.com/v2/venues/search?client_id={}&client_secret={}&ll={},{}&v={}&query={}&radius={}&limit={}'.format(CLIENT_ID, CLIENT_SECRET, latitude, longitude, VERSION, item_pref, RADIUS, LIMIT)
                try :
                    if not args.quiet:
                        time_now()
                        print("url : ",url)
                    results = requests.get(url).json()
                    # assign relevant part of JSON to venues
                    venues = results['response']['venues']

                    # tranform venues into a dataframe
                    dataframe = json_normalize(venues)
                    if not args.quiet:
                        time_now()
                        print(dataframe.head())
                    try:
                        # keep only columns that include venue name, and anything that is associated with location
                        filtered_columns = ['name', 'categories'] + [col for col in dataframe.columns if col.startswith('location.')] + ['id']
                        dataframe_filtered = dataframe.loc[:, filtered_columns]
                    except:
                        if not args.quiet:
                            time_now()
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
                        if not args.quiet:
                            time_now()
                            print("Something went wrong!")
                        continue

                    # clean column names by keeping only last term
                    dataframe_filtered.columns = [column.split('.')[-1] for column in dataframe_filtered.columns]

                    #dataframe_filtered.head()

                    # copying it to stationary shop dataframe

                    data_frame = dataframe_filtered.copy()
                    list_df.append(data_frame)
                except:
                    if not args.quiet:
                        time_now()
                        print("Preference : ",item_pref," doesn't exists!!!")
            if not args.quiet:
                time_now()
                print(list_df)
            # create map latitude and longitude values
            if not args.quiet:
                time_now()
                print("MAP SELECTED :=> ",self.dropdown_map_select.get())
            
            MAP_FINAL = folium.Map(location=[latitude, longitude], tiles=str(self.dropdown_map_select.get()),zoom_start=11)
            # configuration for the dafault map to be created!
            marker_cluster = MarkerCluster().add_to(MAP_FINAL)
            
            for list_item in list_df:
                FILL_COL = str(get_random_col())
                OVER_COL = str(get_random_col())
                col_fill.append(FILL_COL)
                col_border.append(OVER_COL)

                # Check whether the values are actually present or not!
                # for latitudes
                try:
                    len_data = len(list_item['lat'])
                    if not args.quiet:
                        time_now()
                        print("TOTAL DATA FETCHED",len_data)
                        time_now()
                        print(list_item['lat'])
                except:
                    #pass
                    if not args.quiet:
                        print("NOT got any 'lat' values! using default")
                    list_item['lat'] = [None]*int(len_data)
                
                # for longitudes
                try:
                    if not args.quiet:
                        time_now()
                        print("TOTAL DATA FETCHED",len(list_item['lng']))
                        time_now()
                        print(list_item['lng'])
                except:
                    #pass
                    if not args.quiet:
                        print("NOT got any 'lng' values! using default")
                    list_item['lng'] = [None]*int(len_data)
                    if not args.quiet:
                        time_now()
                        print(list_item['lng'])
                
                # for categories
                
                try:
                    if not args.quiet:
                        time_now()
                        print("TOTAL DATA FETCHED",len(list_item['categories']))
                        time_now()
                        print(list_item['categories'])
                except:
                    #pass
                    if not args.quiet:
                        print("NOT got any 'categories' values! using default")
                    list_item['categories'] = [None]*int(len_data)
                    if not args.quiet:
                        time_now()
                        print(list_item['categories'])
                
                # for postalCode values

                try:
                    if not args.quiet:
                        time_now()
                        print("TOTAL DATA FETCHED",len(list_item['postalCode']))
                        time_now()
                        print(list_item['postalCode'])
                except:
                    #pass
                    if not args.quiet:
                        print("NOT got any 'postalCode' values! using default")
                    list_item['postalCode'] = [None]*int(len_data)
                    if not args.quiet:
                        time_now()
                        print(list_item['postalCode'])
                
                
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
                dots_html = ""
                for var1, var2, var3 in zip(pref_list,col_fill,col_border):
                    dots_html = dots_html + """
                    &nbsp; {} &nbsp;
                    <svg height="10" width="10">
                    <circle cx="5" cy="5" r="4" stroke="{}" stroke-width="3" fill="{}" />
                    </svg><br/> """.format(str(var1),str(var3),str(var2))
                
                if not args.quiet:
                    time_now()
                    print(dots_html)
            legend_html = """
                    <div style = "position: fixed; top: 5px; left: 900px; z-index:9999;">
                        <h1 ><i style="color:#c6ae0d; font face=Verdana,Arial,Helvetica "> WISP </i></h1> 
                    </div>
                    <div style="position: fixed; 
                    bottom: 50px; left: 50px;  
                    border:2px solid grey; z-index:9999; font-size:14px;">&nbsp; 
                        <b>Legend <b>
                        <br>{}
                    </div>
                    <div style="position: fixed; 
                    bottom: 50px; right: 50px;  
                    z-index:9999; font-size:10px;
                    "> 
                        <b style="color:#f90404" style="align: justified">
                            WISP <br/> 
                            version: 0.0.8-beta <br/>
                            &copyJimut Bahan Pal <br/> 
                            Author : jimutbahanpal@yahoo.com 
                        </b>
                    </div>
                    """.format(str(dots_html))
            time_now()
            if not args.quiet:
                print(legend_html)

            MAP_FINAL.get_root().html.add_child(folium.Element(legend_html))
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
                time_now()
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
            global root
            root.destroy()
            if not args.quiet:
                time_now()
                print("Destroying window!! exiting from GUI to Web - Browser")

            # to get the name of the file to be saved!
            if save_name_map == None:
                pass
            else:
                name_final = save_name_map+".html"
                if save_name_map==None:
                    pass
                else:
                    if not args.quiet:
                        time_now()
                        print("WRITING TO HTML FILE !!!")
                    time_now()
                    with open(name_final, 'w') as file_:
                        file_.write(folium_map_html)
            try:
                if not args.quiet:
                    time_now()
                os.remove(".html")
                if not args.quiet:
                    print("CACHES REMOVED!")
            except:
                if not args.quiet:
                    time_now()
                    print("...CLEANING CACHES!")
            
            run_html_server(folium_map_html)

    def main():
        global root
        root = Tk()
        root.configure(background=color_bg_app)
        # initialising the app
        guiProj(root)
        # goes on and on loop for tkinter!
        root.mainloop()

    if __name__ == "__main__":
        main()
