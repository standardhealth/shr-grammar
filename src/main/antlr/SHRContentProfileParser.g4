parser grammar SHRContentProfileParser;

options { tokenVocab=SHRContentProfileLexer; }

// DATA DEFINITIONS (Grammar: ContentProfile)

doc:                docHeader contentsDefs;
docHeader:          KW_GRAMMAR KW_G_CONTENT_PROFILE version;

contentsDefs:       (namespaceHeader contentDefs)*;
namespaceHeader:    KW_NAMESPACE namespace;

contentDefs:        contentDef*;
contentDef:         (contentHeader cpRules) | (contentHeader headerFlags) | contentHeader;
contentHeader:      simpleName COLON;

cpRules:            cpRule*;
cpRule:             simpleOrPathName flags;

flags:              flag+;
flag:               KW_MUST_SUPPORT;

headerFlags:        headerFlag+;
headerFlag:         KW_NO_PROFILE;

// COMMON BITS

version:            WHOLE_NUMBER DOT WHOLE_NUMBER;
namespace:          LOWER_WORD | DOT_SEPARATED_LW;
simpleName:         UPPER_WORD | ALL_CAPS | LOWER_WORD; //LOWER_WORD is not intended use, and will throw an error. However, this prevents compiler crash.
pathName:           simpleName (DOT simpleName)+;
simpleOrPathName:   simpleName | pathName;
