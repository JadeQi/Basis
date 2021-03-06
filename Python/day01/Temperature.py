"""
Author: MoncozGC
Data: 2020/4/12
"""

# 华氏温度转换为摄氏温度。
# 提示：华氏温度到摄氏温度的转换公式为：$C=(F - 32) \div 1.8$

f = float(input("请输入华氏温度: "))
c = (f - 32) / 1.8
print("%0.1f华氏度 = %0.1f摄氏度" % (f, c))
print(f'{f:.1f}华氏度 = {c:.1f}摄氏度')

x = 0
y = 0
y += 10
print("%d--%d" % (x, y))

# %0.1f 代表一个占位符, 会有一个float类型的代替, 0.1代表有一位小数
# other:
#   %d 代表int类型
#   %s 代表字符串
#   {f:.1f}
