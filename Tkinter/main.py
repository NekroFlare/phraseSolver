#   a214_simple_window1.py
#   A program creates a window on your screen using Tkinter.
import tkinter as tk

def test_my_button():
    frame_auth.tkraise()
    user_password = ent_password.get()
    lbl_auth_password.config(text="\n your password is "+user_password, font=('Courier', 20))

# main window
root = tk.Tk()
root.wm_geometry("400x250")
root.title("Authorization")

frame_login = tk.Frame(root)
frame_login.grid(row=0, column=0, sticky='news')
lbl_username = tk.Label(frame_login, text='Username:',font='Courier')
lbl_password = tk.Label(frame_login,text="Password:",font="Courier")
ent_username = tk.Entry(frame_login, bd=3)
ent_password = tk.Entry(frame_login, bd=3, show="*")
btn_login = tk.Button(frame_login, text='Login', font='Courier', command=test_my_button)

lbl_username.pack(padx=165, pady=5)
ent_username.pack(pady=5)
lbl_password.pack(pady=5)
ent_password.pack(pady=5)
btn_login.pack(pady=5)

frame_auth = tk.Frame(root)
frame_auth.grid(row=0, column=0, sticky='news')
lbl_auth_password = tk.Label(frame_auth)
lbl_auth_password.pack(pady = 0, padx = 0)

frame_login.tkraise()

root.mainloop()
