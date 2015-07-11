//
//  Label.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/10/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Label.h"

@implementation Label

-(id)init{
    if(self=[super init]){
        text = @"";
    }
    return self;
}

-(void)draw{
    // to be implemented
}

// getter methods
-(NSString*)getText { return text; }

// setter methods
-(void)setText:(NSString*)value { text = value; }

@end
