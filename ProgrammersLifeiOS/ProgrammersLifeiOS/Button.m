//
//  Button.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/12/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Button.h"

@implementation Button

-(id)init{
    if(self = [super init]){
        // to be implemented
    }
    return self;
}

-(void)draw{
    // to be implemented
}

// getter methods
-(Label*)getLabel { return label; }
-(NSString*)getButtonImage { return buttonImage; }

// setter methods
-(void)setLabel:(Label*)value { label = value; }
-(void)setButtonImage:(NSString*)value { buttonImage = value; }

@end
