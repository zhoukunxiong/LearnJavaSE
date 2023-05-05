# 实现摇骰子功能
# 导入random包,使用其中randint()
from random import randint
# 打开图片包
import os
from time import sleep

while True:
    x = randint(1, 6)
    os.system(r"start 骰子点数/" + str(x) + ".gif")
    sleep(10)
