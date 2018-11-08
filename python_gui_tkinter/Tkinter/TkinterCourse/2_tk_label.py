
import tkinter as tk

# As we have already mentioned, labels can contain text and images. The following example contains two labels, one with a text and the other one with an image
root = tk.Tk()
logo = tk.PhotoImage(file="python.png")

w1 = tk.Label(root, image=logo).pack(side="right")

explanation = """At present, only GIF and PPM/PGM
formats are supported, but an interface 
exists to allow additional image file
formats to be added easily."""

w2 = tk.Label(root, 
              justify=tk.LEFT,
              padx = 10, 
              text=explanation).pack(side="left")
root.mainloop()
