## `SetFocus( CAT )`

Keyword sets the focus to the GUI-Object with the Category name `CAT`.

### Parameter

### Correspondences

| Abstruction Level         | Expression                  |
| ------------------------: | :---------------------------|
| OKW                       | `SetFocus( CAT )`           |
| Gherkin++ Category        | `CAT (I): #focus`           |
| Gherkin++ AC              | `WHEN CAT HAS #focus`       |
| Called OKW GUI-Adapter Method | `IGUIChildwindow.Focus()`   |

## Opponent

See: [[VerifyHasFocus( CAT, ExpVal )|VerifyHasFocus( CAT, ExpVal )]], [[LogHasFocus( CAT )|LogHasFocus( CAT )]]


##Examples

### Default Usage

```java
EN.SetFocus( "User" )
```

### ![Harmony](https://user-images.githubusercontent.com/15831418/75094375-b47a8e80-558a-11ea-9959-41d2569c21e6.png){: height=23 }

```
Categories:
User (I): John
Password (I): ahjelpdqQ
OK (A): #PRESSED; #focus

Acceptance Criteria:
WHEN User IS John AND
 Password IS ahjelpdqQ
WHEN OK HAS #focus

```