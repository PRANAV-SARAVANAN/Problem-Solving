# Generate a QR Code that directly takes to my github profile on scanning it

import qrcode

qc=qrcode.make('https://github.com/PRANAV-SARAVANAN')
qc.save("qrcode.png")
qc.show()
