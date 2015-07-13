//
//  Button.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/12/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Label.h"

@interface Button : Sprite{
    Label *label;
    NSString *buttonImage;
}

-(void)draw;

// getter methods
-(Label*)getLabel;
-(NSString*)getButtonImage;

// setter methods
-(void)setLabel:(Label*)value;
-(void)setButtonImage:(NSString*)value;

@end