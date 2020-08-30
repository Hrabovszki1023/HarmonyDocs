## `SetFocus( CAT )`

Keyword sets the focus to the GUI-Object with the Category name `CAT`.

### Parameter

### Correspondences

| Abstruction Level         | Expression                  |
| ------------------------: | :---------------------------|
| OKW                       | `SetFocus( CAT )`             |
| Gherkin++ Category        | `CAT (I): #focus`             |
| Gherkin++ AC              | `WHEN CAT HAS #focus`         |
| Called OKW GUI-Adapter Method | `IGUIChildwindow.Focus()`  |

## Opponent

See: [[VerifyHasFocus( CAT, ExpVal )|VerifyHasFocus( CAT, ExpVal )]], [[LogHasFocus( CAT )|LogHasFocus( CAT )]]


AAAA

???+ example
  === "OKW"
    ``` java
    EN.SetFocus( "User" )
    ```
  === "Harmony"
    ```
    Categories:
    User (I): John
    Password (I): ahjelpdqQ
    OK (A): #pressed; #focus

    Acceptance Criteria:
    WHEN User IS John AND
    Password IS ahjelpdqQ
    WHEN OK HAS #focus
    ```