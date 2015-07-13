//
//  Sprite.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Sprite : NSObject{
    // TODO :: try to figure out how to store the image data
    float xpos;
    float ypos;
    int width;
    int height;
    BOOL displayed;
}

-(void)draw;

// getter methods
-(float)getXpos;
-(float)getYpos;
-(int)getWidth;
-(int)getHight;
-(BOOL)getDisplayed;

// setter methods
-(void)setXpos:(float)value;
-(void)setYpos:(float)value;
-(void)setWidth:(int)value;
-(void)setHeight:(int)value;
-(void)setDisplayed:(BOOL)value;

@end
