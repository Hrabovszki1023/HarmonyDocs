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


!!! example

    === "Unordered List"

        _Example_:

        ``` markdown
        * Sed sagittis eleifend rutrum
        * Donec vitae suscipit est
        * Nulla tempor lobortis orci
        ```

        _Result_:

        * Sed sagittis eleifend rutrum
        * Donec vitae suscipit est
        * Nulla tempor lobortis orci

    === "Ordered List"

        _Example_:

        ``` markdown
        1. Sed sagittis eleifend rutrum
        2. Donec vitae suscipit est
        3. Nulla tempor lobortis orci
        ```

        _Result_:

        1. Sed sagittis eleifend rutrum
        2. Donec vitae suscipit est
        3. Nulla tempor lobortis orci




### uschi

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