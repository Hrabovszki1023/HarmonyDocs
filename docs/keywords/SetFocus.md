## `SetFocus( CAT )`

Keyword sets the focus to the GUI-Object with the Category name `CAT`.

### Parameter

### Correspondences

| Abstruction Level         | Expression                  |
| ------------------------: | :---------------------------|
| OKW                       | `SetFocus( CAT )`           |
| Gherkin++ Category        | `CAT (I): #FOCUS`           |
| Gherkin++ AC              | `WHEM CAT HAS #FOCUS`       |
| Called OKW GUI-Adapter Method | `IGUIChildwindow.Focus()`   |

## Opponent

See: [[VerifyHasFocus( CAT, ExpVal )|VerifyHasFocus( CAT, ExpVal )]], [[LogHasFocus( CAT )|LogHasFocus( CAT )]]


##Examples

### Default Usage

```java
EN.SetFocus( "User" )
```

### <img src="https://user-images.githubusercontent.com/15831418/75094375-b47a8e80-558a-11ea-9959-41d2569c21e6.png" height="23">

```
Categories:
User (I): John
Password (I): ahjelpdqQ
OK (A): #PRESSED; #FOCUS

Acceptance Criteria:
WHEN User IS John AND
 Password IS ahjelpdqQ
WHEN OK HAS #FOCUS

```