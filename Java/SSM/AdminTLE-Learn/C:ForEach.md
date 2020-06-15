这些标签封装了Java中的for，while，do-while循环。

相比而言，

<c:forEach>标签是更加通用的标签，因为它迭代一个***集合中的对象***。

<c:forTokens>标签通过***指定分隔符***将字符串分隔为一个***数组***然后迭代它们。

### forEach 语法格式

```
<c:forEach
    items="<object>"
    begin="<int>"
    end="<int>"
    step="<int>"
    var="<string>"
    varStatus="<string>">
    ...
```

### forTokens 语法格式

```
<c:forTokens
    items="<string>"
    delims="<string>"
    begin="<int>"
    end="<int>"
    step="<int>"
    var="<string>"
    varStatus="<string>">
```