package com.github.tbje.facelift

package object imports {
  implicit val augmentElemToElementOps = html.ElementOps.augmentElemToElementOps _
  implicit val intToUnit = css.intToUnit _
  implicit val doublToUnit = css.doublToUnit _

  implicit val tuple2ToAttrBase = attr.AttributeBase.tuple2ToAttrBase _
  implicit val tuple2ToAttrBase2 = attr.AttributeBase.tuple2ToAttrBase2 _

  implicit val elemOps = attr.elemToElemOps _

  implicit val strContextToXmlInterpolate = html.XmlInterpolate.strContextToXmlInterpolate _

  val Doctype = html.Doctype
  val A = html.A
  val Abbr = html.Abbr
  val Acronym = html.Acronym
  val Address = html.Address
  val Applet = html.Applet
  val Area = html.Area
  val Article = html.Article
  val Aside = html.Aside
  val Audio = html.Audio
  val B = html.B
  val Base = html.Base
  val Basefont = html.Basefont
  val Bdi = html.Bdi
  val Bdo = html.Bdo
  val Big = html.Big
  val Blockquote = html.Blockquote
  val Body = html.Body
  val Br = html.Br
  val Button = html.Button
  val Canvas = html.Canvas
  val Caption = html.Caption
  val Center = html.Center
  val Cite = html.Cite
  val Code = html.Code
  val Col = html.Col
  val Colgroup = html.Colgroup
  val Command = html.Command
  val Datalist = html.Datalist
  val Dd = html.Dd
  val Del = html.Del
  val Details = html.Details
  val Dfn = html.Dfn
  val Dialog = html.Dialog
  val Dir = html.Dir
  val Div = html.Div
  val Dl = html.Dl
  val Dt = html.Dt
  val Em = html.Em
  val Embed = html.Embed
  val Fieldset = html.Fieldset
  val Figcaption = html.Figcaption
  val Figure = html.Figure
  val Font = html.Font
  val Footer = html.Footer
  val Form = html.Form
  val Frame = html.Frame
  val Frameset = html.Frameset
  val H1 = html.H1
  val H2 = html.H2
  val H3 = html.H3
  val H4 = html.H4
  val H5 = html.H5
  val H6 = html.H6
  val Head = html.Head
  val Header = html.Header
  val Hr = html.Hr
  val Html = html.Html
  val I = html.I
  val Iframe = html.Iframe
  val Img = html.Img
  val Input = html.Input
  val Ins = html.Ins
  val Kbd = html.Kbd
  val Keygen = html.Keygen
  val Label = html.Label
  val Legend = html.Legend
  val Li = html.Li
  val Link = html.Link
  val Mark = html.Mark
  val Menu = html.Menu
  val Meta = html.Meta
  val Meter = html.Meter
  val Nav = html.Nav
  val Noframes = html.Noframes
  val Noscript = html.Noscript
  val Object = html.Object
  val Ol = html.Ol
  val Optgroup = html.Optgroup
  val Option = html.Option
  val Output = html.Output
  val P = html.P
  val Param = html.Param
  val Pre = html.Pre
  val Progress = html.Progress
  val Q = html.Q
  val Rp = html.Rp
  val Rt = html.Rt
  val Ruby = html.Ruby
  val S = html.S
  val Samp = html.Samp
  val Script = html.Script
  val Section = html.Section
  val Select = html.Select
  val Small = html.Small
  val Source = html.Source
  val Span = html.Span
  val Strike = html.Strike
  val Strong = html.Strong
  val StyleTag = html.Style
  val Sub = html.Sub
  val Summary = html.Summary
  val Sup = html.Sup
  val Table = html.Table
  val Tbody = html.Tbody
  val Td = html.Td
  val Textarea = html.Textarea
  val Tfoot = html.Tfoot
  val Th = html.Th
  val Thead = html.Thead
  val Time = html.Time
  val Title = html.Title
  val Tr = html.Tr
  val Track = html.Track
  val Tt = html.Tt
  val U = html.U
  val Ul = html.Ul
  val Var = html.Var
  val Video = html.Video
  val Wbr = html.Wbr

  type Id = attr.Id
  val Id = attr.Id
  val Class = attr.Class
  val Cols = attr.Cols
  val Colspan = attr.Colspan
  val Name = attr.Name
  val For = attr.For
  val Placeholder = attr.Placeholder
  val Style = attr.Style
  val Src = attr.Src
  val Href = attr.Href
  val OnLoad = attr.OnLoad
  val OnUnload = attr.OnUnload
  val OnClick = attr.OnClick
  val OnDblClick = attr.OnDblClick
  val OnMouseDown = attr.OnMouseDown
  val OnMouseUp = attr.OnMouseUp
  val OnMouseOver = attr.OnMouseOver
  val OnMouseMove = attr.OnMouseMove
  val OnMouseOut = attr.OnMouseOut
  val OnFocus = attr.OnFocus
  val OnBlur = attr.OnBlur
  val OnKeyPress = attr.OnKeyPress
  val OnKeyDown = attr.OnKeyDown
  val OnKeyUp = attr.OnKeyUp
  val OnSubmit = attr.OnSubmit
  val OnReset = attr.OnReset
  val OnSelect = attr.OnSelect
  val OnChange = attr.OnChange

  val Rel = attr.Rel
  val Role = attr.Role
  val Rows = attr.Rows
  val Type = attr.Type
  val Value = attr.Value
  val Content = attr.Content
  val Charset = attr.Charset
  val DataToggle = attr.DataToggle
  val DataTarget = attr.DataTarget

  val CssMeasure = css.CssMeasure
  val CssElementWithoutChildren = css.CssElementWithoutChildren
  val CssElementWithChildren = css.CssElementWithChildren
  val CssSelector = css.CssSelector

  val AlignmentAdjust = css.AlignmentAdjust
  val AlignmentBaseline = css.AlignmentBaseline
  val Animation = css.Animation
  val AnimationDelay = css.AnimationDelay
  val AnimationDirection = css.AnimationDirection
  val AnimationDuration = css.AnimationDuration
  val AnimationIterationCount = css.AnimationIterationCount
  val AnimationName = css.AnimationName
  val AnimationPlayState = css.AnimationPlayState
  val AnimationTimingFunction = css.AnimationTimingFunction
  val Appearance = css.Appearance
  val Auto = css.Auto
  val BackfaceVisibility = css.BackfaceVisibility
  val Background = css.Background
  val BackgroundAttachment = css.BackgroundAttachment
  val BackgroundClip = css.BackgroundClip
  val BackgroundColor = css.BackgroundColor
  val BackgroundImage = css.BackgroundImage
  val BackgroundOrigin = css.BackgroundOrigin
  val BackgroundPosition = css.BackgroundPosition
  val BackgroundRepeat = css.BackgroundRepeat
  val BackgroundSize = css.BackgroundSize
  val BaselineShift = css.BaselineShift
  val BookmarkLabel = css.BookmarkLabel
  val BookmarkLevel = css.BookmarkLevel
  val BookmarkTarget = css.BookmarkTarget
  val Border = css.Border
  val BorderBottom = css.BorderBottom
  val BorderBottomColor = css.BorderBottomColor
  val BorderBottomLeftRadius = css.BorderBottomLeftRadius
  val BorderBottomRightRadius = css.BorderBottomRightRadius
  val BorderBottomStyle = css.BorderBottomStyle
  val BorderBottomWidth = css.BorderBottomWidth
  val BorderCollapse = css.BorderCollapse
  val BorderColor = css.BorderColor
  val BorderImage = css.BorderImage
  val BorderImageOutset = css.BorderImageOutset
  val BorderImageRepeat = css.BorderImageRepeat
  val BorderImageSlice = css.BorderImageSlice
  val BorderImageSource = css.BorderImageSource
  val BorderImageWidth = css.BorderImageWidth
  val BorderLeft = css.BorderLeft
  val BorderLeftColor = css.BorderLeftColor
  val BorderLeftStyle = css.BorderLeftStyle
  val BorderLeftWidth = css.BorderLeftWidth
  val BorderRadius = css.BorderRadius
  val BorderRight = css.BorderRight
  val BorderRightColor = css.BorderRightColor
  val BorderRightStyle = css.BorderRightStyle
  val BorderRightWidth = css.BorderRightWidth
  val BorderSpacing = css.BorderSpacing
  val BorderStyle = css.BorderStyle
  val BorderTop = css.BorderTop
  val BorderTopColor = css.BorderTopColor
  val BorderTopLeftRadius = css.BorderTopLeftRadius
  val BorderTopRightRadius = css.BorderTopRightRadius
  val BorderTopStyle = css.BorderTopStyle
  val BorderTopWidth = css.BorderTopWidth
  val BorderWidth = css.BorderWidth
  val Bottom = css.Bottom
  val BoxAlign = css.BoxAlign
  val BoxDecorationBreak = css.BoxDecorationBreak
  val BoxDirection = css.BoxDirection
  val BoxFlex = css.BoxFlex
  val BoxFlexGroup = css.BoxFlexGroup
  val BoxLines = css.BoxLines
  val BoxOrdinalGroup = css.BoxOrdinalGroup
  val BoxOrient = css.BoxOrient
  val BoxPack = css.BoxPack
  val BoxShadow = css.BoxShadow
  val BoxSizing = css.BoxSizing
  val CaptionSide = css.CaptionSide
  val Clear = css.Clear
  val Clip = css.Clip
  val Color = css.Color
  val ColumnCount = css.ColumnCount
  val ColumnFill = css.ColumnFill
  val ColumnGap = css.ColumnGap
  val ColumnRule = css.ColumnRule
  val ColumnRuleColor = css.ColumnRuleColor
  val ColumnRuleStyle = css.ColumnRuleStyle
  val ColumnRuleWidth = css.ColumnRuleWidth
  val ColumnSpan = css.ColumnSpan
  val ColumnWidth = css.ColumnWidth
  val Columns = css.Columns
  val CounterIncrement = css.CounterIncrement
  val CounterReset = css.CounterReset
  val Crop = css.Crop
  val CssElement = css.CssElement
  val Cursor = css.Cursor
  val Direction = css.Direction
  val Display = css.Display
  val DominantBaseline = css.DominantBaseline
  val DropInitialAfterAdjust = css.DropInitialAfterAdjust
  val DropInitialAfterAlign = css.DropInitialAfterAlign
  val DropInitialBeforeAdjust = css.DropInitialBeforeAdjust
  val DropInitialBeforeAlign = css.DropInitialBeforeAlign
  val DropInitialSize = css.DropInitialSize
  val DropInitialValue = css.DropInitialValue
  val EmptyCells = css.EmptyCells
  val Fit = css.Fit
  val FitPosition = css.FitPosition
  val Float = css.Float
  val FloatOffset = css.FloatOffset
  val FontFace = css.FontFace
  val FontFamily = css.FontFamily
  val FontSize = css.FontSize
  val FontSizeAdjust = css.FontSizeAdjust
  val FontStretch = css.FontStretch
  val FontStyle = css.FontStyle
  val FontVariant = css.FontVariant
  val FontWeight = css.FontWeight
  val GridColumns = css.GridColumns
  val GridRows = css.GridRows
  val HangingPunctuation = css.HangingPunctuation
  val Height = css.Height
  val HyphenateAfter = css.HyphenateAfter
  val HyphenateBefore = css.HyphenateBefore
  val HyphenateCharacter = css.HyphenateCharacter
  val HyphenateLines = css.HyphenateLines
  val HyphenateResource = css.HyphenateResource
  val Hyphens = css.Hyphens
  val Icon = css.Icon
  val ImageOrientation = css.ImageOrientation
  val ImageResolution = css.ImageResolution
  val Inherit = css.Inherit
  val InlineBoxAlign = css.InlineBoxAlign
  val Keyframes = css.Keyframes
  val Left = css.Left
  val LetterSpacing = css.LetterSpacing
  val LineHeight = css.LineHeight
  val LineStacking = css.LineStacking
  val LineStackingRuby = css.LineStackingRuby
  val LineStackingShift = css.LineStackingShift
  val LineStackingStrategy = css.LineStackingStrategy
  val ListStyle = css.ListStyle
  val ListStyleImage = css.ListStyleImage
  val ListStylePosition = css.ListStylePosition
  val ListStyleType = css.ListStyleType
  val Margin = css.Margin
  val MarginBottom = css.MarginBottom
  val MarginLeft = css.MarginLeft
  val MarginRight = css.MarginRight
  val MarginTop = css.MarginTop
  val MarkAfter = css.MarkAfter
  val MarkBefore = css.MarkBefore
  val Marks = css.Marks
  val MarqueeDirection = css.MarqueeDirection
  val MarqueePlayCount = css.MarqueePlayCount
  val MarqueeSpeed = css.MarqueeSpeed
  val MarqueeStyle = css.MarqueeStyle
  val MaxHeight = css.MaxHeight
  val MaxWidth = css.MaxWidth
  val MinHeight = css.MinHeight
  val MinWidth = css.MinWidth
  val MoveTo = css.MoveTo
  val NavDown = css.NavDown
  val NavIndex = css.NavIndex
  val NavLeft = css.NavLeft
  val NavRight = css.NavRight
  val NavUp = css.NavUp
  val Orphans = css.Orphans
  val Outline = css.Outline
  val OutlineColor = css.OutlineColor
  val OutlineOffset = css.OutlineOffset
  val OutlineStyle = css.OutlineStyle
  val OutlineWidth = css.OutlineWidth
  val Overflow = css.Overflow
  val OverflowStyle = css.OverflowStyle
  val OverflowX = css.OverflowX
  val OverflowY = css.OverflowY
  val Padding = css.Padding
  val PaddingBottom = css.PaddingBottom
  val PaddingLeft = css.PaddingLeft
  val PaddingRight = css.PaddingRight
  val PaddingTop = css.PaddingTop
  val Page = css.Page
  val PageBreakAfter = css.PageBreakAfter
  val PageBreakBefore = css.PageBreakBefore
  val PageBreakInside = css.PageBreakInside
  val PagePolicy = css.PagePolicy
  val Perspective = css.Perspective
  val PerspectiveOrigin = css.PerspectiveOrigin
  val Phonemes = css.Phonemes
  val Position = css.Position
  val PunctuationTrim = css.PunctuationTrim
  val Quotes = css.Quotes
  val Resize = css.Resize
  val Rest = css.Rest
  val RestAfter = css.RestAfter
  val RestBefore = css.RestBefore
  val Right = css.Right
  val Rotation = css.Rotation
  val RotationPoint = css.RotationPoint
  val RubyAlign = css.RubyAlign
  val RubyOverhang = css.RubyOverhang
  val RubyPosition = css.RubyPosition
  val RubySpan = css.RubySpan
  val Size = css.Size
  val StringSet = css.StringSet
  val TableLayout = css.TableLayout
  val Target = css.Target
  val TargetName = css.TargetName
  val TargetNew = css.TargetNew
  val TargetPosition = css.TargetPosition
  val TextAlign = css.TextAlign
  val TextAlignLast = css.TextAlignLast
  val TextDecoration = css.TextDecoration
  val TextHeight = css.TextHeight
  val TextIndent = css.TextIndent
  val TextJustify = css.TextJustify
  val TextOutline = css.TextOutline
  val TextOverflow = css.TextOverflow
  val TextShadow = css.TextShadow
  val TextTransform = css.TextTransform
  val TextWrap = css.TextWrap
  val Top = css.Top
  val Transform = css.Transform
  val TransformOrigin = css.TransformOrigin
  val TransformStyle = css.TransformStyle
  val Transition = css.Transition
  val TransitionDelay = css.TransitionDelay
  val TransitionDuration = css.TransitionDuration
  val TransitionProperty = css.TransitionProperty
  val TransitionTimingFunction = css.TransitionTimingFunction
  val UnicodeBidi = css.UnicodeBidi
  val VerticalAlign = css.VerticalAlign
  val Visibility = css.Visibility
  val VoiceBalance = css.VoiceBalance
  val VoiceDuration = css.VoiceDuration
  val VoicePitch = css.VoicePitch
  val VoicePitchRange = css.VoicePitchRange
  val VoiceRate = css.VoiceRate
  val VoiceStress = css.VoiceStress
  val VoiceVolume = css.VoiceVolume
  val WhiteSpace = css.WhiteSpace
  val Widows = css.Widows
  val Width = css.Width
  val WordBreak = css.WordBreak
  val WordSpacing = css.WordSpacing
  val WordWrap = css.WordWrap
  val ZIndex = css.ZIndex

}
