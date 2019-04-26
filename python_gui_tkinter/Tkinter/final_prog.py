
'''
GRID VIDEO SPLITTER APPLICATION

The program is mend to take a source video file as input and split it into m*n grid format (the audio being preserved).
It allows the user to choose the values of m and n and also the out put video format.
It allows gives options to: 
trim the video - based on start time and end time given by the user 
apply video effects - user is asked to choose among a list of 25 effects
make the video to a square shape - user is given options regarding how he wants to fill up the square (i.e. with a blurred version of the original video or with any of the 8 colours provided as choice)
'''


#import the necessary inbuilt  libraries (i.e. opencv, numpy, os, moviepy.editor, tkinter)
import cv2
import numpy as np
import os
from moviepy.editor import *
import tkinter

#import the necessary files from the above libraries
from tkinter import *
from os import path
from tkinter import filedialog, ttk, messagebox
from tkinter.ttk import *


#function to add effects to the video
def image_effects(image,op):

	#image is the frame on which effect is to applied
	#op is the user's choice of effect to be applied

	#the effect choosen by the user is searched for using if - elif block
	if (op == 'black and white'):
		#BLACK AND WHITE
		effect_image = image

		#the BGR values are adjusted
		effect_image[: , : , 0] =image[: , : , 0]
		effect_image[: , : , 1] =image[: , : , 0]
		effect_image[: , : , 2] =image[: , : , 0]
	

	elif (op == 'hue'):
		#HUE
		effect_image = image

		#the BGR values are adjusted
		effect_image[: , : , 0] =image[: , : , 0]
		effect_image[: , : , 1] =image[: , : , 1]
		effect_image[: , : , 2] =image[: , : , 0]


	elif (op == 'retro'):
		#RETRO
		effect_image = image

		#the BGR values are adjusted
		effect_image[: , : , 0] =image[: , : , 2]
		effect_image[: , : , 1] =image[: , : , 2]
		effect_image[: , : , 2] =image[: , : , 2]

		#brightness and contrast are adjusted
		contrast=0.3
		brightness=20
		effect_image = cv2.addWeighted( effect_image, contrast, effect_image, 0, brightness)
	

	elif (op == 'infrared'):
		#INFRARED
		#original image is conver to HSV scale from BGR scale
		effect_image = cv2.cvtColor(image, cv2.COLOR_BGR2HSV)


	elif (op == 'glare'):
		#GLARE
		#brightness and contrast are adjusted
		contrast=5
		brightness=-8
		effect_image = cv2.addWeighted( image, contrast, image, 0, brightness)

	elif (op == 'gloomy'):
		#GLOOMY
		#brightness and contrast are adjusted
		contrast=0.3
		brightness=15
		effect_image = cv2.addWeighted( image, contrast, image, 0, brightness)


	elif (op == 'blur'):
		#BLUR
		#original image is blurred with required parameters
		effect_image = cv2.blur(image,(10,10))


	elif (op == 'washed out'):
		#WASHED OUT (TAKES TIME)
		#bilateral filter is used on the original image with a set of parameter values
		effect_image = cv2.bilateralFilter(image,75,120,150)


	elif (op == 'distance blur'):
		#DISTANCE BLUR
		#bilateral filter is used on the original image with a different set of parameter values
		effect_image = cv2.bilateralFilter(image,30,100,100)


	elif (op == 'water color'):
		#WATER COLOUR
		#median blur is used on the original image with a set of parameter values
		effect_image = cv2.medianBlur(image,21)


	elif (op == 'low detail'):
		#LOW DETAIL
		#median blur is used on the original image with a different set of parameter values
		median = cv2.medianBlur(image,27)
		#brightness and contrast are adjusted
		contrast=2
		brightness=-20
		effect_image = cv2.addWeighted( median, contrast, median, 0, brightness)


	elif (op == 'sandy'):
		#SANDY
		#gaussian blur is used on the original image with a set of parameter values
		gauss = cv2.GaussianBlur(image,(25,25),80)
		#brightness and contrast are adjusted
		contrast=1
		brightness=-20
		effect_image = cv2.addWeighted( gauss, contrast, gauss, 0, brightness)


	elif (op == 'negative'):
		#NEGATIVE
		#the BGR value of the image is altered
		effect_image = abs(255 - image)


	elif (op == 'burnt'):
		#BURNT
		n = 2    # Number of levels of quantization
		indices = np.arange(0,256)   # List of all colors 
		divider = np.linspace(0,255,n+1)[1] # we get a divider
		quantiz = np.int0(np.linspace(0,255,n)) # we get quantization colors

		color_levels = np.clip(np.int0(indices/divider),0,n-1) # color levels 0,1,2..
		palette = quantiz[color_levels] # Creating the palette
		im2 = palette[image]  # Applying palette on image

		effect_image = cv2.convertScaleAbs(im2) # Converting image back to uint8


	elif(op == 'red scale'):
		#RED SCALE
		effect_image = image

		#the B and G values of the BGR scale is deducted
		effect_image[:, :, 0] = np.absolute(effect_image[:, :, 0] - effect_image[:, :, 0])
		effect_image[:, :, 1] = np.absolute(effect_image[:, :, 1] - effect_image[:, :, 1])	


	elif(op == 'green scale'):
		#GREEN SCALE
		effect_image = image

		#the B and R values of the BGR scale is deducted
		effect_image[:, :, 0] = np.absolute(effect_image[:, :, 0] - effect_image[:, :, 0])
		effect_image[:, :, 2] = np.absolute(effect_image[:, :, 2] - effect_image[:, :, 2])


	elif(op=='blue scale'):
		#BLUE SCALE
		effect_image = image

		#the R and G values of the BGR scale is deducted
		effect_image[:, :, 1] = np.absolute(effect_image[:, :, 1] - effect_image[:, :, 1])
		effect_image[:, :, 2] = np.absolute(effect_image[:, :, 2] - effect_image[:, :, 2])


	elif(op == 'yellow scale'):
		#YELLOW SCALE
		effect_image = image
		#the B value of the BGR scale is deducted
		effect_image[:, :, 0] = np.absolute(effect_image[:, :, 0] - effect_image[:, :, 0])


	elif(op == 'pink world'):
		#PINK WORLD
		effect_image = image
		#the G value of the BGR scale is deducted
		effect_image[:, :, 1] = np.absolute(effect_image[:, :, 1] - effect_image[:, :, 1])


	elif(op == 'cyan play'):
		#CYAN PLAY
		effect_image = image
		#the R value of the BGR scale is deducted
		effect_image[:, :, 2] = np.absolute(effect_image[:, :, 2] - effect_image[:, :, 2])


	elif(op == 'marine'):
		#MARINE
		effect_image = image
		#the G value of the BGR scale is adjusted
		effect_image[:, :, 1] = image[:,:,2]


	elif(op== 'dull'):
		#DULL
		effect_image = image

		#the BGR values are adjusted
		effect_image[:, :, 0] = image[:,:,2] 
		effect_image[:, :, 1] = image[:,:,1] 
		effect_image[:, :, 2] = image[:,:,1]


	elif(op == 'faded'):
		#FADED
		effect_image = image

		#the B value of the BGR scale is adjusted
		effect_image[:, :, 0] = image[:,:,1]

		#brightness and contrast are adjusted
		contrast=0.8
		brightness=15
		effect_image = cv2.addWeighted( effect_image, contrast, effect_image, 0, brightness)


	elif(op=='moods'):
		#MOODS
		effect_image = image

		#the G value of the BGR scale is adjusted
		effect_image[:, :, 1] = image[:,:,0]

		#brightness and contrast are adjusted
		contrast=1
		brightness=10
		effect_image = cv2.addWeighted(effect_image, contrast, effect_image, 0, brightness)


	elif(op == 'slumber'):
		effect_image = image

		#the B value of the BGR scale is deducted
		effect_image[:, :, 0] = np.absolute(effect_image[:, :, 0] - effect_image[:, :, 0])

		#brightness and contrast are adjusted
		contrast=0.5
		brightness=20
		effect_image = cv2.addWeighted(effect_image, contrast, effect_image, 0, brightness)

		#the BGR values are adjusted
		effect_image[:, :, 0] = image[:,:,0]
		effect_image[:, :, 1] = image[:,:,1] 
		effect_image[:, :, 2] = image[:,:,2]


	return effect_image
	#image_effects() function ends



#function to merge the extracted frames into a video
def convert_frames_to_video(each_vid,pathOut,fps,number_of_frames):

    #each_vid is the 1D array containing all the frames to be merged to get one of the aplitted videos
    #pathOut stores the path to the destination folder
    #fps contains the frame per second value of the source video file
    #number_of_frames stores the number of frames present in the source video file

	#array to which the images shall be appended one at a time
    frame_array = []

 	#appending the frames to the array(frame_array[]) started
    for i in range(0, number_of_frames):

        #each of the frames of the splitted videos are extracted from the !D array each_vid
        img=each_vid[i] 

        #the shape of each frames are computed and the video shape is determined
        height, width, layers = img.shape
        size = (width,height)

        #inserting the frames into an image array
        frame_array.append(img)
 
 	#converting frame_array[] into a video file
    out = cv2.VideoWriter(pathOut,cv2.VideoWriter_fourcc(*'DIVX'), fps, size)

    #a loop is iterated from the starting frame till the last frame
    for i in range(0, number_of_frames):

        # writing to a image array
        out.write(frame_array[i])

    out.release()
    #end of convert_frames_to_video( ) function



#function to change the shape of the image into a square
#in case the source image is already a square, this function won't make any difference
def make_square(in_img,colour):

	#in_img stores the frame to be converted to square
	#colour stores the choice of the user for converting to square

	#a copy of the image is taken
	img=in_img 

	#parameters of the image obtained
	height, width, channels = img.shape

	#heigth and width of the final image should be the maximum of {height,width}
	x = height if height > width else width
	y = height if height > width else width

	#we initialize a square canvas with all black pixels
	square= np.zeros((x,y,3), np.uint8) 

	#setting up the base of the canvas based on user input
	if(colour.lower()=='red'):
		#for red
		square[:,:] = (0,0,255)

	elif(colour.lower()=='blue'):
		#for blue
		square[:,:] = (255,0,0) 

	elif(colour.lower()=='green'):
		#for green
		square[:,:] = (0,150,0) 

	elif(colour.lower()=='yellow'):
		#for yellow
		square[:,:] = (0,255,255)

	elif(colour.lower()=='pink'):
		#for pink
		square[:,:] = (255,0,255)

	elif(colour.lower()=='cyan'):
		#for cyan
		square[:,:] = (255,255,0) 

	elif(colour.lower()=='white'):
		#for white
		square[:,:] = (255,255,255)

	elif(colour.lower()=='black'):
		#for black
		square[:,:] = (0,0,0)

	else:
		#for a blured background
		square = cv2.resize(img, (x, y)) #the frame is resized to square
		square = cv2.blur(square,(20,20)) #the image is blured
		#the brightness and contrast are adjusted
		contrast=0.6
		brightness=0
		square = cv2.addWeighted( square, contrast, square, 0, brightness)

	#the image is placed on the center of the square canvas(w.r.t. to height or width)
	square[int((y-height)/2):int(y-(y-height)/2), int((x-width)/2):int(x-(x-width)/2)]= img

	#return the squared frame
	return square
	#end of make_square( ) method



#function to split frames into mxn blocks
def split_frames(frame_name, dim1, dim2):

	#frame_name contains the frame to be splitted
	#dim1 contains the number of grids row wise
	#dim2 contains the number of grids column wise

	#dim1 and dim2 are converted to integer
	mm=int(dim1)
	nn=int(dim2)
	#the total number of division is computed and stored in mn
	mn=mm*nn

	#an empty array is created to store all the splitted frames
	images=[]

	#a copy of the image name taken
	image=frame_name
	#height and width of the original frame is computed
	height, width = image.shape[:2]

	#cordinates for the top-left corner of each image initialized
	start_row, start_col = int(0), int(0)

	#loop to divide the image along its row
	for i in range(1,mm+1):
		
		#coordinates for the bottom-right corner of each image initialized
		end_row, end_col = int((height/mm)*i), int(width)
		
		#sub-loop to divide the image along its column
		for j in range(1,nn+1):

			end_col=int((width/nn)*j)

			#a new splitted frame is formed by extracting a portion of the original frame
			img = image[start_row:end_row , start_col:end_col]
			
			#the splitted frame is appended with the array
			images.append(img)

			#the value of start_col is adjusted
			start_col=end_col
			#end of j loop

		#the values of start_row and start_col are adjusted for the next iteration	
		start_row=end_row
		start_col=int(0)

	#the array containing all the splitted frames is returned
	return images
	#end of split_frames( ) function



#function to extract all the frames from the video
def extract_frames(vid_name, dim1, dim2, number_of_frames,colour,flag,flag_effect,op,start_frame,end_frame):
	
	#vid_name contains the name of the source video file
	#dim1 contains the number of grids row wise
	#dim2 contains the number of grids column wise
	#flag contains whether the video is to converted to a sqaure shape or not
	#colour stores the choice of the user for converting to square
	#pathOut stores the path to the destination folder
	#fps contains the frame per second value of the source video file
	#number_of_frames stores the number of frames present in the source video file
	#flag_effect contains whether an effect is to be applied or not
	#op is the user's choice of effect to be applied
	#start_frame stores the index of the starting frame
	#end_frame stores the index of the last frame

	#reading the video file and storing it as an object 
	cap = cv2.VideoCapture(vid_name)

	#an empty 1D array is created to store the spllited portions of each frame
	frames=[]
	#an empty 2D array is created to store the spllited portions of all the frames
	frames2 = []
	frames2.append([])

	#variable to act as idex for denoting frames(w.r.t. timeline)
	currentFrame = 1

	#process of reading each  frame separately started
	for i in range(currentFrame, end_frame + 1):

		#frames gets initialized before we proceed with every frame
		frames=[]

		# Capture frame-by-frame
		ret, frame = cap.read()

		if(currentFrame >= start_frame):

			# Saves image of the current frame in jpg file
			name = './data/frame' + str(currentFrame) + '.jpg'

			#check whether effect is to applied and call the image_effects function if so by passing the required arguments
			if(flag_effect.lower()=='yes'):
				frame=image_effects(frame,op)

			#check if the video is to be converted into square shape and call the make_sqaure function if so by passing the required arguments
			if (flag.lower()=='yes'):
				frame=make_square(frame,colour)	

			print ('Creating...' + name)

			#store the splitted frames returned by split_frames function in the array frames
			frames=split_frames(frame, dim1, dim2)

			#insert the splitted frames stored in the array frames as the next row of the 2D array frames2
			fr2_len=len(frames2)
			frames2.insert(int(fr2_len-1),frames)

		# increment current feame by 1
		currentFrame += 1

	#clearing the computer memory of all the video data
	cap.release()
	cv2.destroyAllWindows()

	#return the 2D array containg all the splitted frames
	return frames2
	#end of extract_frames( ) function



#function to extract a portion of the string
#for the current program this function serves to remove the path and extension from the video filename
def substring(text):
	
	pos1=text.rfind('/') #finds the last index of occurence of '/'
	pos2=text.rfind('.') #finds the last index of occurence of '.'

	#if '.' is not found
	if(pos2 == -1):
		pos2=len(text)

	#extract the portion of text starting from pos1+1 to pos2
	s=text[(pos1+1):pos2]

	#return the new string so formed
	return s



#function to call all the different modules as required and write the ouput video to the destination folder
def execute(vid_name, dim1, dim2, output_format, flag_square, colour, flag2, start_time, end_time, flag_effect, op_effect, destination_path):
	
	#vid_name contains the name of the source video file
	#dim1 contains the number of grids row wise
	#dim2 contains the number of grids column wise
	#output_format stored the format in which the output video is to be written
	#flag_square contains whether the video is to converted to a sqaure shape or not
	#colour stores the choice of the user for converting to square
	#flag_effect contains whether an effect is to be applied or not
	#op_effect is the user's choice of effect to be applied
	#flag2 stores whether the video is to be trmmed or not
	#start_time stores the starting time
	#end_time stores the ending time
	#destination_path stores the path of the destination folder where the output video is to be stored abter the job is completed

	#variable to store the total number of portions into which the video is to be divided
	mn=int(dim1)*int(dim2)

	#create an opencv object of the source video file
	cap = cv2.VideoCapture(vid_name)
	
	#variable to store the total number of frames of the whole video
	number_of_frames = int(cap.get(cv2.CAP_PROP_FRAME_COUNT))

	#variable to store the frame-rate of the video
	fps = int(cap.get(cv2.CAP_PROP_FPS))

	#calculate the total duration of the source video file
	duration=number_of_frames/fps

	#intialize start_frame and end_frame
	start_frame=1
	end_frame=number_of_frames

	#check whether the video is to be trimmed and calculate the start_frame and end_frame accordingly
	if (flag2.lower()=='yes'):
		start_frame=int(start_time)*fps
		end_frame=int(end_time)*fps
	else:
		start_time=0
		end_time=duration

	#create a 2D array to store all the splitted frames
	frames = []
	frames.append([])

	#store all the splitted frames as returned on calling the function extract_frames with the required parameters
	frames=extract_frames(vid_name, dim1, dim2, number_of_frames,colour,flag_square,flag_effect,op_effect, start_frame, end_frame)

	#compute the height and width of the 2D areray returned
	length = len(frames)
	length2 = len(frames[0])

	#store the path where the output video id to be stored
	path=destination_path+'./Grid Video Splitter files'

	#creating directory to store the final split videos
	try:
	    if not os.path.exists(path):
	        os.makedirs(path)
	except OSError:
	    print (' ')

	#extracting the video filename without extension
	vdnm=substring(vid_name)

	#extracting the audio from the source video file
	audioclip = AudioFileClip(vid_name)
	#the new audio clip is formed after trimming operation oa per user's choice
	newclip = audioclip.subclip(int(start_time),int(end_time))
	
	#all the splitted frames to come under a video are extracted frrom the 2D array and stored in a seperate 1D array
	for i in range(0,length2):
		each_vid=[]
		for j in range(0,length-1):
			img = frames[j][i]
			each_vid.append(img)

		#store the path where the output video id to be stored
		pathOut = destination_path+'./Grid Video Splitter files/'+vdnm +'_'+ str(i+1) +'.avi'

		#convert_frames_to_video( ) function is called for each of the splitted videos with the required parameters
		convert_frames_to_video(each_vid, pathOut, fps, int(end_frame-start_frame))
		videoclip=VideoFileClip(pathOut)
		pathOut = destination_path+'./Grid Video Splitter files/'+vdnm +'_'+ str(i+1) +output_format

		#audio is attached to the splitted video so generated
		videoclip2 = videoclip.set_audio(newclip)
		#the video file with audio is written to the hard disk at the destination folder
		videoclip2.write_videofile(pathOut)

		pathOut = destination_path+'./Grid Video Splitter files/'+vdnm +'_'+ str(i+1) +'.avi'
		os.remove(pathOut)
	
	#clearing the computer memory of all the video data
	cap.release()
	#end of execute( ) function



#function to design the GUI
def run_gui():

	#create a blank tkinter window specifying the title, geometry, and background colour
	window = Tk()
	window.title("G R I D       V I D E O       S P L I T T E R")
	window.geometry('1450x750')
	window.configure(bg='#334353')
	window.resizable(False, False)


	#---------------------------styling the window--------------------------------------------

	
	#configure and set the style (background and foreground) of the window and all its widgets
	gui_style = Style()
	gui_style.configure('My.TLabel', foreground='#FFFFFF', background='#334353')
	gui_style.configure('My.TButton', foreground='#224366')
	gui_style.configure('My.TEntry', foreground='#224366')
	gui_style.configure('My.TCheckbutton', foreground='#FFFFFF', background='#334353')
	gui_style.configure('My.TCombobox', foreground='#224366')
	gui_style.configure('My.TRadiobutton', foreground='#FFFFFF', background='#334353')


	#-------------------------------------file (0)-------------------------------------

	
	#create label to ask for source video file
	lbl_file = Label(window, text="Soure video: ", font=("Aparajita", 18), style='My.TLabel')
	lbl_file.grid(column=0, row=0, padx=(50,0), pady=(45,20))

	#create text file for user to enter the source video file
	txt_file = Entry(window,width=65, font=("Aparajita", 16), style='My.TButton')
	txt_file.grid(column=1, row=0, columnspan=15, padx=(14,10), pady=(45,20))
	txt_file.focus()

	#function to be executed on clicking the browse button
	def browsefunc():

		#a dialogue box is displayed on the screen where the user can easily browse and select the input video file
		filename = filedialog.askopenfilename()
		txt_file.delete(0, END)
		txt_file.insert(0, "")
		txt_file.insert(END, filename)

	#a button to enable the user to browse among files
	browsebutton = Button(window, text="Browse", command=browsefunc, style='My.TButton')
	browsebutton.grid(column=16, row=0, padx=(0,50), pady=(45,20))


	#----------------------------------dimension (1)-------------------------------------------------------------

	#label to ask the user for dimensions
	lbl_dim = Label(window, text="Dimensions: ", font=("Aparajita", 18), style='My.TLabel')
	lbl_dim.grid(column=0, row=1, padx=(50,0), pady=(0,20))

	#declare an integer variable
	val_dim_row=IntVar() 
	#sets the deafault value of the spinbox to 1
	val_dim_row.set(1) 
	#spinbox to input the number of grid row wise
	spin_dim_row = Spinbox(window, from_=1, to=10, width=5, font=("Aparajita", 16), textvariable=val_dim_row)
	spin_dim_row.grid(column=1,row=1, padx=(0,0), pady=(0,20))

	lbl_x = Label(window, text="x      ", font=("Aparajita", 18), style='My.TLabel')
	lbl_x.grid(column=2, row=1, padx=(0,20), pady=(0,20))

	#declare an integer variable
	val_dim_col=IntVar()
	#sets the deafault value of the spinbox to 1
	val_dim_col.set(1)
	#spinbox to input the number of grid row wise	
	spin_dim_col = Spinbox(window, from_=1, to=10, width=5, font=("Aparajita", 16), textvariable=val_dim_col)
	spin_dim_col.grid(column=3,row=1, padx=(30,50), pady=(0,20))


	#------------------------------------format (2)-------------------------------------------------------------

	#label to ak the user for output video format
	lbl_format = Label(window, text="Video format: ", font=("Aparajita", 18), style='My.TLabel')
	lbl_format.grid(column=0, row=2, padx=(50,0), pady=(0,20))

	#combox containing the available output video formats from where the user can choose
	combo_format = Combobox(window, style='My.TCombobox')
	combo_format['values']= ('.mp4', '.webm')
	combo_format.current(0) #set the initial selected item
	combo_format.grid(column=1, row=2, padx=(12,50), pady=(0,20))


	#--------------------------------------trim (3, 4, 5)-------------------------------------------------------------------

	#function that gets initiated when user clicks on yes
	def trfunc_yes():

		#display the input options for trimming the video
		lbl_tr_start.grid()
		spin_tr_start.grid()
		lbl_tr_end.grid()
		spin_tr_end.grid()

	#function that gets initiated when user clicks on no
	def trfunc_no():

		#hide the input options for trimming the video
		lbl_tr_start.grid_remove()
		spin_tr_start.grid_remove()
		lbl_tr_end.grid_remove()
		spin_tr_end.grid_remove()


	#label to ask the user whether he wants to trim the video or not
	lbl_tr = Label(window, text="Trim the video? ", font =("Aparajita", 18), style='My.TLabel')
	lbl_tr.grid(column=0, row=3, columnspan=2, padx=(0,0), pady=(0,20))

	#initialize an integer variable
	val_tr = IntVar()
	#rabio buttons to let the user choose between yes and no
	rad_tr_yes = Radiobutton(window,text='Yes', value=1, variable=val_tr, command=trfunc_yes, style='My.TRadiobutton')
	rad_tr_no = Radiobutton(window,text='No', value=2, variable=val_tr, command=trfunc_no, style='My.TRadiobutton')
	rad_tr_yes.grid(column=3, row=3, padx=(0,0), pady=(0,20))
	rad_tr_no.grid(column=4, row=3, padx=(0,0), pady=(0,20))


	#initialize an integer variable	
	val_trim_start=IntVar()
	val_trim_start.set(0)

	#label asking the user for start time
	lbl_tr_start = Label(window, text="Start Time (in secs): ", font= ("Aparajita", 16), style='My.TLabel')
	lbl_tr_start.grid(column=1, row=4, columnspan=2, padx=(0,0), pady=(0,10))

	#spinbox to let the user click and select the start time or input it directly by typing
	spin_tr_start = Spinbox(window, from_=0, to=1000, width=5, font=("Aparajita", 14), textvariable=val_trim_start)
	spin_tr_start.grid(column=3,row=4, padx=(10,50), pady=(0,10))


	#initialize an integer variable
	val_trim_end=IntVar()
	val_trim_end.set(1)

	#label asking the user for start time
	lbl_tr_end = Label(window, text="End Time(in secs): ", font= ("Aparajita", 16), style= 'My.TLabel')
	lbl_tr_end.grid(column=1, row=5, columnspan=2, padx=(0,0), pady=(0,20))

	#spinbox to let the user click and select the end time or input it directly by typing
	spin_tr_end = Spinbox(window, from_=1, to=1000, width=5, font=("Aparajita", 14), textvariable=val_trim_end)
	spin_tr_end.grid(column=3,row=5, padx=(10,50), pady=(0,20))

	#hide the input options for trimming the video
	lbl_tr_start.grid_remove()
	spin_tr_start.grid_remove()
	lbl_tr_end.grid_remove()
	spin_tr_end.grid_remove()


	#----------------------------------square fit (6, 7)--------------------------------------------

	
	#function that gets initiated when user clicks on yes
	def sqfunc_yes():

		#display the input options for making the video square
		lbl_sq.grid()
		combo_sq.grid()

	#function that gets initiated when user clicks on no
	def sqfunc_no():

		#hide the input options for making the video square
		lbl_sq.grid_remove()
		combo_sq.grid_remove()

	#label to ask the user whether he wants to sqare fit the video
	lbl_sq = Label(window, text="Square fit the video? ", font =("Aparajita", 18), style='My.TLabel')
	lbl_sq.grid(column=0, row=6, columnspan=2, padx=(0,0), pady=(0,20))

	#initialize an integer variable
	val_sq = IntVar()
	#rabio buttons to let the user choose between yes and no
	rad_sq_yes = Radiobutton(window,text='Yes', value=1, variable=val_sq, command=sqfunc_yes, style='My.TRadiobutton')
	rad_sq_no = Radiobutton(window,text='No', value=2, variable=val_sq, command=sqfunc_no, style='My.TRadiobutton')
	rad_sq_yes.grid(column=3, row=6, padx=(0,0), pady=(0,20))
	rad_sq_no.grid(column=4, row=6, padx=(0,0), pady=(0,20))

	#label asking the user how he wants to fill the square
	lbl_sq = Label(window, text="Fill square with ", font =("Aparajita", 16), style='My.TLabel')
	lbl_sq.grid(column=1, row=7, columnspan=1, padx=(0,0), pady=(0,20))
	lbl_sq.grid_remove()

	#combobox providing the user with all the available options to fill the square from where he can select
	combo_sq = Combobox(window,  font =("Aparajita", 14), style='My.TCombobox')
	combo_sq['values']= ('blur video', 'white', 'black', 'red', 'blue', 'green', 'yellow','pink','cyan')
	combo_sq.current(0) #set the selected item
	combo_sq.grid(column=3, row=7, columnspan=2, padx=(0,0), pady=(0,20))
	combo_sq.grid_remove()


	#--------------------------------------effects (8, 9)-------------------------------------------

	
	#function that gets initiated when user clicks on yes
	def ef_func_yes():
		lbl_ef.grid()
		combo_ef.grid()

	#function that gets initiated when user clicks on no
	def ef_func_no():
		lbl_ef.grid_remove()
		combo_ef.grid_remove()

	#label asking the user whether he wants to apply effects to the video or not
	lbl_ef = Label(window, text="Apply effect to the video? ", font =("Aparajita", 18), style='My.TLabel')
	lbl_ef.grid(column=0, row=8, columnspan=2, padx=(0,0), pady=(0,20))

	#initialize an integer variable
	val_ef = IntVar()
	#rabio buttons to let the user choose between yes and no
	rad_tr_yes = Radiobutton(window,text='Yes', value=1, variable=val_ef, command=ef_func_yes, style='My.TRadiobutton')
	rad_tr_no = Radiobutton(window,text='No', value=2, variable=val_ef, command=ef_func_no, style='My.TRadiobutton')
	rad_tr_yes.grid(column=3, row=8, padx=(0,0), pady=(0,20))
	rad_tr_no.grid(column=4, row=8, padx=(0,0), pady=(0,20))

	#label asking the user to choose the effect he wants to apply
	lbl_ef = Label(window, text="Choose effects", font =("Aparajita", 16), style='My.TLabel')
	lbl_ef.grid(column=1, row=9, columnspan=1, padx=(0,0), pady=(0,20))
	lbl_ef.grid_remove()

	#combobox providing the user with all the available effects from where he can select
	combo_ef = Combobox(window,  font =("Aparajita", 14), style= 'My.TCombobox')
	combo_ef['values']= ('black and white', 'retro', 'red scale','green scale','blue scale','yellow scale','pink world','cyan play','marine','dull','faded','moods','slumber','infrared', 'glare', 'gloomy', 'blur', 'washed out', 'distance blur', 'water color', 'low detail', 'sandy', 'negative', 'burnt', 'hue')
	combo_ef.current(0) #set the selected item
	combo_ef.grid(column=3, row=9, columnspan=2, padx=(0,0), pady=(0,20))
	combo_ef.grid_remove()


	#----------------------------------output directory (10)--------------------------------------------------------


	#label to ask the user for the destination folder 
	lbl_dir = Label(window, text="Destination folder: ", font=("Aparajita", 18), style='My.TLabel')
	lbl_dir.grid(column=0, row=10, padx=(50,0), pady=(5,20))
	#entry widget to let the user enter the destination folder
	txt_dir = Entry(window,width=65, font=("Aparajita", 16), style='My.TButton')
	txt_dir.grid(column=1, row=10, columnspan=15, padx=(14,10), pady=(5,20))

	#fuction that gets called on clicking the browse button
	def browse_dir_func():

		#a dialogue box opens which lets the user to browse and choose directories to be given as input
		dir_name = filedialog.askdirectory()
		txt_dir.delete(0, END)
		txt_dir.insert(0, "")
		txt_dir.insert(END, dir_name)

	#a button to let the user browse the directories
	browse_dir_button = Button(window, text="Browse", command=browse_dir_func, style='My.TButton')
	browse_dir_button.grid(column=16, row=10, padx=(0,50), pady=(5,20))


	#------------------------------------progress bar(11)-----------------------------------------------------

	#function that gets called at stage 1 of the progress in execution
	def advance_1():
		val_pbar.set(10)
		lbl_prcs['text'] = "Processing..........."

	#function that gets called at stage 2 of the progress in execution
	def advance_2():
		val_pbar.set(25)
		lbl_prcs['text'] = "Extracting frames..........."

	#function that gets called at stage 3 of the progress in execution
	def advance_3():
		val_pbar.set(50)
		lbl_prc.grid()
		lbl_prcs['text'] = "Building and Exporting videos..........."
		lbl_prc['text'] = "Please wait! This may take several minutes............."

	#function that gets called at stage 4 of the progress in execution
	def advance_4():
		val_pbar.set(100)
		lbl_prc.grid_remove()
		lbl_prcs['text'] = "Task Completed"

	#initialize and set an integer variable
	val_pbar=IntVar()
	val_pbar.set(0)

	#progressbar bar to show the progress of the task
	pbar = Progressbar(window, length=350, maximum=100, variable=val_pbar)
	pbar.grid(column=2, row=11, columnspan=4, padx=(0,0), pady=(25,10))
	pbar.grid_remove()


	#---------------------------------processing labels(12, 13)----------------------------------------

	#label to show the progress of the task
	lbl_prcs_text="Starting process.............."
	lbl_prcs = Label(window, text=lbl_prcs_text, font =("Aparajita", 16), style='My.TLabel')
	lbl_prcs.grid(column=2, row=12, columnspan=4, padx=(0,0), pady=(0,3))
	lbl_prcs.grid_remove()

	#label to give additional information about the progress of the task to the user
	lbl_prc = Label(window, text=" ", font =("Aparajita", 16), style='My.TLabel')
	lbl_prc.grid(column=2, row=13, columnspan=4, padx=(0,0), pady=(0,50))	


	#---------------------------------------run (11)-----------------------------------------------

	
	#function for linking the ui with the execution code
	def on_release():

		#get and store the source video file name from the ui
		filename=txt_file.get()
		vid_name=filename

		#get and store the grid dimensions from the ui
		dim1=spin_dim_row.get()
		dim2=spin_dim_col.get()

		#get and store the output format from the ui
		output_format=combo_format.get()

		#get the whether the video is to be square fitted from the ui and initialize flag_square accordingly
		if (val_sq.get()==1):
			flag_square='yes'
		else:
			flag_square='no'
		#get and store the colour from the ui
		colour=combo_sq.get()

		#get the whether the video is to be trimmed from the ui and initialize flag2 accordingly
		if(val_tr.get()==1):
			flag2='yes'
		else:
			flag2='no'
		#get and store the start_time and end_time from the ui
		start_time=spin_tr_start.get()
		end_time=spin_tr_end.get()

		#get the whether effect is to applied from the ui and initialize flag_square accordingly
		if (val_ef.get()==1):
			flag_effect='yes'
		else:
			flag_effect='no'
		#get and store the effect type from the ui
		op_effect=combo_ef.get()

		#get and store the destination path from the ui
		destination_path=txt_dir.get()

		#call the execute function to get the process initiated
		execute(vid_name, dim1, dim2, output_format, flag_square, colour, flag2, start_time, end_time, flag_effect, op_effect, destination_path)
		#advance the progress bar
		advance_4()

		#store the output path
		path=destination_path+'./Grid Video Splitter files'
		path=os.path.realpath(path)
		#open the output folder containg the final videos produced once the task is completed
		os.startfile(path)

		#clear the memory
		cv2.destroyAllWindows()
		#end of on_release( ) function


	#function to check for valid inputs
	def check_inputs( ):

		#set result to 0
		result=0

		#get and store the source video file name from the ui
		filename=txt_file.get()	

		#get and store the grid dimensions from the ui
		dim1=spin_dim_row.get()
		dim2=spin_dim_col.get()

		#get the whether the video is to be trimmed from the ui and initialize flag2 accordingly
		if(val_tr.get()==1):
			flag2='yes'
		else:
			flag2='no'
		#get and store the start_time and end_time from the ui
		start_time=spin_tr_start.get()
		end_time=spin_tr_end.get()

		#get and store the destination path from the ui
		destination_path=txt_dir.get()

		#variavle to store the total number of portions into which the video is to be divided
		mn=int(dim1)*int(dim2)

		#convert the video to opencv object
		cap = cv2.VideoCapture(filename)
		
		#variable to store the total number of frames of the whole video
		number_of_frames = int(cap.get(cv2.CAP_PROP_FRAME_COUNT))

		#variable to store the frame-rate of the video
		fps = int(cap.get(cv2.CAP_PROP_FPS))

		try:
			#store the duration of the video
			duration=number_of_frames/fps
		except ZeroDivisionError:
			#if fps=0 (i.e. source video file not found), display an error message
			messagebox.showerror('Invalid input', 'Video file not found')
			#return the result
			return result

		#initialize start frame and end frame
		start_frame=1
		end_frame=number_of_frames

		#if video is to be trimeed compute the changed start frame and end frame based on the entered start time and end time
		if (flag2.lower()=='yes'):
			start_frame=int(start_time)*fps
			end_frame=int(end_time)*fps

		#initialize flag_dim and flag_trim to 1
		flag_dim=flag_trim=1
		#store the error messages
		error_dim='Dimensions should between 0 and 10'
		error_trim='Start time should be greater than 0 and less than end time.\n End time should be less than '+str(duration)+'.'

		#check if dim1 and dim2 are within 0 and 10 (both included), if not flag_dim=0
		if((int(dim1)>10 or int(dim1)<1) or (int(dim2)>10 or int(dim2)<1)):
			flag_dim=0

		#check if the trimming conditions are correct, if not flag_trim=0
		if( (start_frame >= end_frame) or (start_frame < 0) or (end_frame > number_of_frames)):
			flag_trim=0

		#check if there is error in both the dimension and trim values and display error message accordingly
		if(flag_trim==0 and flag_dim==0):
			messagebox.showerror('Invalid dimension and trim values', error_dim+'\n'+error_trim)
			#reinitialise the dimension and trim values
			val_dim_row.set(1)
			val_dim_col.set(1)
			val_trim_start.set(0)
			val_trim_end.set(1)

		#check if there is error in trim values as entered by the user and display an error message accordingly
		elif(flag_trim==0 and flag_dim==1):
			messagebox.showerror('Invalid trim value', error_trim)
			#reinitialize the start +time and end time
			val_trim_start.set(0)
			val_trim_end.set(1)

		#check if there is an error in the dimension values as entered by the user and display an error message accordingly
		elif(flag_dim==0 and flag_trim==1):
			messagebox.showerror('Invalid dimension values', error_dim)
			#reinitialize the dimension values
			val_dim_row.set(1)
			val_dim_col.set(1)
		
		#if there is no error set result to 1
		else:
			result=1

		#rerutn the result value
		return result
		# end of check_inputs( ) function


	#function that gets called before the split button is released
	def delayed_on_release(event):

		#store the result returned after the inputs are checked for their validation
		result=check_inputs()
		#if there is no error begin with the esecution process
		if (result==1):
			lbl_prcs.grid()
			pbar.grid()
			#initiate the progress bar and progress it with time
			window.after(350, advance_1)
			window.after(3000, on_release)
			window.after(1500, advance_2)
			window.after(2840, advance_3)

	#button to let the user initiate the execution process
	runbutton = Button(window, text="Split", style= 'My.TButton')
	runbutton.grid(column=1, row=11, padx=(0,0), pady=(25,10))	
	#declare a function to be callled before the button is realesed
	runbutton.bind("<ButtonRelease>", delayed_on_release)

	#keep the ui window on a loop so that it stays on the main screen
	window.mainloop()


def main():
	#call the function to run the ui
	run_gui()

if __name__=="__main__":
	#call the main method
    main()
