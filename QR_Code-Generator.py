import qrcode

qc=qrcode.make('https://github.com/PRANAV-SARAVANAN')
qc.save("qrcode.png")
qc.show()