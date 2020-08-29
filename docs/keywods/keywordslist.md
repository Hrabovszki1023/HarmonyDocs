<img src="https://www.openkeyword.de/images/OKW_Logos/150x78/okw_color_msoffice_nobackground.png" width="150px" height="78px" />

#GUI-Keywords

## Testcase Keywords

* `BeginTest( TCN )` - [[More...|BeginTest( TCN )]]
* `EndTest()` - [[More...|EndTest( )]]

## Application Handling 

* `StarApp( AN )` - [[More...|StartApp( AN )]]
* `StopApp( AN )` - [[More...|StopApp( AN )]]

## User Activities

* `ClickOn( CAT )` - [[More...|ClickOn( CAT )]]
* `DoubleClickOn( CAT )` - [[More...|DoubleClickOn( CAT )]]
* `SetFocus( CAT )` - [[More...|SetFocus( CAT )]]
* `SetValue( FN, Val )` - [[More...|SetValue( FN, Val )]]
* `SetVar( VN, Val )` - [[More...|SetValue( VN, Val )]]
* `Select( FN, Val )` - [[More...|Select( FN, Val )]]
* `SelectMenu( FN )` - [[More...|SelectMenu( FN )]]
* `SelectMenu( FN, Val )` - [[More...|SelectMenu( FN, Val )]]
* `TypeKey( FN, Val )` - [[More...|TypeKey( FN, Val )]]

## Sequence

* `Sequence( FN, SQN, SEQ_ID )` - [[More...|Sequence( FN, SQN, SEQ_ID )]]

## Window Specific Keywords

* `SelectWindow( FN )` - [[More...|SelectWindow( FN )]]
* `SelectChild( FN )` - [[More...|SelectChild( FN )]]


## Verifying

* `VerifyExists( FN, ExpVal)` - [[More...|VerifyExists( FN, ExpVal )]]
* `VerifyHasFocus( CAT, ExpVal )` - [[More...|VerifyHasFocus( CAT, ExpVal )]]
* `VerifyIsActive( FN, ExpVal )` - [[More...|VerifyIsActive( FN, ExpVal )]]

VerifyMaxLength( String FN, String ExpVal )
VerifyMinLength( String FN, String ExpVal )

### VerifyCaption

* `VerifyCaption( FN, ExpVal )` use for exact match. [[More...|VerifyCaption( FN, ExpVal )]]
* `VerifyCaptionWCM( FN, ExpVal )` -> Wildcard match (`?` `*` `#`). [[More...|VerifyCaptionWCM( FN, ExpVal )]]
* `VerifyCaptionREGX( FN, ExpVal )` -> Regular-expression match. [[More...|VerifyCaptionREGX( FN, ExpVal )]]

### VerifyLabel

* `VerifyLabel( FN, ExpVal )` use for exact match. [[More...|VerifyLabel( FN, ExpVal )]]
* `VerifyLabelWCM( FN, ExpVal )` -> Wildcard match (`?` `*` `#`). [[More...|VerifyLabelWCM( FN, ExpVal )]]
* `VerifyLabelREGX( FN, ExpVal )` -> Regular-expression match. [[More...|VerifyLabelREGX( FN, ExpVal )]]

### VerifyPlaceholder

* `VerifyPlaceholder( FN, ExpVal )` use for exact match. [[More...|VerifyPlaceholder( FN, ExpVal )]]
* `VerifyPlaceholderWCM( FN, ExpVal )` -> Wildcard match (`?` `*` `#`). [[More...|VerifyPlaceholderWCM( FN, ExpVal )]]
* `VerifyPlaceholderREGX( FN, ExpVal )` -> Regular-expression match. [[More...|VerifyPlaceholderREGX( FN, ExpVal )]]

### VerifySelectedValue

* `VerifySelectedValue( FN, ExpVal )` use for exact match. [[More...|VerifySelectedValue( FN, ExpVal )]]
* `VerifySelectedValueWCM( FN, ExpVal )` -> Wildcard match (`?` `*` `#`). [[More...|VerifySelectedValueWCM( FN, ExpVal )]]
* `VerifySelectedValueREGX( FN, ExpVal )` -> Regular-expression match. [[More...|VerifySelectedValueREGX( FN, ExpVal )]]

### VerifyTooltip

* `VerifyTooltip( FN, ExpVal )` use for exact match. [[More...|VerifyTooltip( FN, ExpVal )]]
* `VerifyTooltipWCM( FN, ExpVal )` -> Wildcard match (`?` `*` `#`). [[More...|VerifyTooltipWCM( FN, ExpVal )]]
* `VerifyTooltipREGX( FN, ExpVal )` -> Regular-expression match. [[More...|VerifyTooltipREGX( FN, ExpVal )]]

## Memorize Values

* `MemorizeExists( FN, MemKey )` - [[More...|MemorizeExists( FN, MemKey )]]
* `MemorizeHasFocus( FN, MemKey )` - [[More...|MemorizeHasFocus( FN, MemKey )]]
* `MemorizeIsActive( CAT, MemKey )` - [[More...|MemorizeIsActive( CAT, MemKey )]]

* `MemorizeCaption( FN, MemKey )` - [[More...|MemorizeCaption( FN, MemKey )]]
* `MemorizeLabel( FN, MemKey )` - [[More...|MemorizeLabel( FN, MemKey )]]
* `MemorizePlaceholder( FN, MemKey )` - [[More...|MemorizePlaceholder( FN, MemKey )]]
* `MemorizeSelectedValue( CAT, MemKey )` - [[More...|MemorizeTooltip( CAT, MemKey )]]
* `MemorizeTooltip( FN, MemKey )` - [[More...|MemorizeTooltip( FN, MemKey )]]
* `MemorizeValue( FN, MemKey )` - [[More...|MemorizeValue( FN, MemKey )]]

## Log Values

* `LogExists( CAT )` - [[More...|LogExists( CAT )]]
* `LogHasFocus( CAT )` - [[More...|LogHasFocus( CAT )]]
* `LogIsActive( CAT )` - [[More...|LogIsActive( CAT )]]

* `LogCaption( FN )` - [[More...|LogCaption( FN )]]

* `LogLabel( FN )` - [[More...|LogLabel( FN )]]
* `LogPlaceholder( FN )` - [[More...|LogPlaceholder( FN )]]
* `LogTooltip( FN )` - [[More...|LogTooltip( FN )]]
* `LogValue( FN )` - [[More...|LogValue( FN )]]


