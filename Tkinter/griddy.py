import tkinter as tk
root = tk.Tk()
root.wm_geometry("600x600")
content = tk.Frame(root)
blue = tk.Frame(content,bg="blue",width=400,height=300)
green = tk.Frame(content,bg="green",width=200,height=300)
red = tk.Frame(content,bg="red",width=400,height=300)
yellow = tk.Frame(content,bg="yellow",width=200,height=300)

content.grid(column=0,row=0)
blue.grid(column=0,row=0)
green.grid(column=1,row=0)
red.grid(column=0,row=1)
yellow.grid(column=1,row=1)

root.mainloop()
