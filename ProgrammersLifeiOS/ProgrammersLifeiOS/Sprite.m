//
//  Sprite.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Sprite.h"

@implementation Sprite

-(id)init{
    if(self = [super init]){
        xpos = 0.0f;
        ypos = 0.0f;
        width = 0;
        height = 0;
        displayed = NO;
    }
    return self;
}

// getter methods
-(float)getXpos { return xpos; }
-(float)getYpos { return ypos; }
-(int)getWidth { return width; }
-(int)getHight { return height; }
-(BOOL)getDisplayed { return displayed; }

// setter methods
-(void)setXpos:(float)value { xpos = value; }
-(void)setYpos:(float)value { ypos = value; }
-(void)setWidth:(int)value { width = value; }
-(void)setHeight:(int)value { height = value; }
-(void)setDisplayed:(BOOL)value { displayed = value; }

@end